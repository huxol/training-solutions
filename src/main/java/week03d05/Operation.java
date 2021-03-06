package week03d05;

public class Operation {

    private int leftValue;
    private int rightValue;

    public Operation(String s) {
        if (s==null || !s.contains(" + ")) {
            throw new IllegalArgumentException(" Wrong argument! ");
        }
        String[] parts = s.split(" \\+ ");
        leftValue = Integer.parseInt(parts[0]);
        rightValue = Integer.parseInt(parts[1]);
    }

    public int getResult(){
        return leftValue+rightValue;
    }
}
