package week03;

import java.util.ArrayList;
import java.util.List;

public class Position {

    private String name;
    private int bonus;

    public Position(String name, int bonus) {
        this.name = name;
        this.bonus = bonus;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return name + " : " + bonus + " Ft ";
    }

    public static void main(String[] args) {
        List<Position> positions = new ArrayList<>();
        positions.add(new Position("takarító", 20000));
        positions.add(new Position("adminisztrátor", 30000));
        positions.add(new Position("könyvelő", 50000));
        positions.add(new Position("üzletkötő", 200000));
        positions.add(new Position("manager", 500000));
        positions.add(new Position("vezérigazgató", 2000000));

        for (Position pos : positions) {
            if (pos.getBonus() > 150000) {
                System.out.println(pos);
            }
        }
    }
}
