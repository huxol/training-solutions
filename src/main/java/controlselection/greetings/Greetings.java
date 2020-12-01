package controlselection.greetings;

public class Greetings {

    public static final int MINUTES = 60;

    public String greet(int hour, int minutes) {
        int inminutes = hour * minutes + minutes;
        if (inminutes <= 5 * MINUTES || inminutes > 20 * MINUTES) {
            return "Jó éjt";
        }
        else if (inminutes > 5 * MINUTES && inminutes < 9 * MINUTES) {
            return "Jó reggelt!";
        }
        else if (inminutes > 9 * MINUTES && inminutes < 18 * MINUTES + 30) {
            return "Jó napot!";
        }
        else {
            return "Jó estét!";
        }
    }
}
