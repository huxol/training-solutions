package week12d02;

import java.util.ArrayList;
import java.util.List;

public class Street {

    private List<Site> sites = new ArrayList<>();

    public List<FenceStatistic> fenceStatistics() {
        List<FenceStatistic> result = new ArrayList<>();

        for(Site site : sites) {
            FenceStatistic returned = returnFenceIfContains(result, site.getFenceType());
            if(returned.getCount()==1) {
                result.add(returned);
            } else {
                returned.increase();
            }
        }
        return result;
    }

    public FenceStatistic returnFenceIfContains(List<FenceStatistic> fenceStatistics, Fence fenceType) {

        for(FenceStatistic fenceStatistic: fenceStatistics) {
            if(fenceStatistic.getFenceType()==fenceType) {
                return fenceStatistic;
            }
        }
        return new FenceStatistic(fenceType);
    }
 }
