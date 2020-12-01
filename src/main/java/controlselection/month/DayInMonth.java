package controlselection.month;

public class DayInMonth {

    public int numberOfDays(int year, String month) {
        switch (month.toLowerCase()) {
            case "Január":
            case "Március":
            case "Május":
            case "Július":
            case "Augusztus":
            case "Október":
            case "December":
                return 31;
            case "Április":
            case "Június":
            case "Szeptember":
            case "November":
                return 30;
            case "Február":
                if (((year % 4 == 0) &&
                        !(year % 100 == 0))
                        || (year % 400 == 0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                throw new IllegalArgumentException("Invalid month: " + month);
        }
    }
}