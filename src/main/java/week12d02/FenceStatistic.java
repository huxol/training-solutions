package week12d02;

public class FenceStatistic {

    private Fence fenceType;
    private int count;

    public FenceStatistic(Fence fenceType) {
        this.fenceType = fenceType;
        count = 1;
    }

    public Fence getFenceType() {
        return fenceType;
    }

    public int getCount() {
        return count;
    }

    public void increase() {
    }
}
