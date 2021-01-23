package week12d02;

public class Site {

    private int oddEven;
    private int size;
    private Fence fenceType;

    public Site(int oddEven, int size, Fence fenceType) {
        this.oddEven = oddEven;
        this.size = size;
        this.fenceType = fenceType;
    }

    public int getOddEven() {
        return oddEven;
    }

    public int getSize() {
        return size;
    }

    public Fence getFenceType() {
        return fenceType;
    }
}
