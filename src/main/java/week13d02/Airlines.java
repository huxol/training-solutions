package week13d02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Airlines {
    private List<Airways> airlines = new ArrayList<>();

    public void readFile(Path file) {
        try (BufferedReader br = Files.newBufferedReader(file)) {
            airlines.clear();
            String line;
            while ((line = br.readLine()) != null) {
                String[] splitter = line.split(" ");
                String id = splitter[0];
                Status status = (splitter[1].equals("Arrival") ? Status.ARRIVAL : Status.DEPARTURE);
                String city = splitter[2];
                String[] timeSplitter = splitter[3].split(":");
                LocalTime time = LocalTime.of(Integer.parseInt(timeSplitter[0]), Integer.parseInt(timeSplitter[1]));
                airlines.add(new Airways(id, status, city, time));
            }

        } catch (IOException e) {
            throw new IllegalStateException("Can't read file!", e);
        }
    }

    public Status statusCounter() {

        int counterArr = (int) airlines.stream().filter(c -> c.getStatus().equals(Status.ARRIVAL)).count();
        int counterDep = (int) airlines.stream().filter(c -> c.getStatus().equals(Status.DEPARTURE)).count();


        System.out.println(counterArr);
        System.out.println(counterDep);
        return counterArr > counterDep ? Status.ARRIVAL : Status.DEPARTURE;
    }

    public Airways getFlightDetails(String flightId) {
        for (Airways s : airlines) {
            if (s.getId().equals(flightId)) {
                return s;
            }
        }
        throw new IllegalStateException("Can't find flight!");
    }

    public List<Airways> findByCityAndStatus(String city, Status status) {
        List<Airways> result = new ArrayList<>();
        for (Airways a : airlines) {
            if (a.getCity().equals(city) && a.getStatus().equals(status)) {
                result.add(a);
            }
        }
        return result;
    }

    public Airways getEarliest() {
        Airways earliest = new Airways("", Status.DEPARTURE, "", LocalTime.of(23, 59));
        for (Airways a : airlines) {
            if (a.getTime().isBefore(earliest.getTime()) && a.getStatus().equals(Status.DEPARTURE)) {
                earliest = a;
            }
        }
        return earliest;
    }

    public List<Airways> getAirlines() {
        return airlines;
    }

    public static void main(String[] args) {
        Airlines airlines = new Airlines();
        airlines.readFile(Path.of("cities.txt"));
        System.out.println(airlines.statusCounter());
        Airways airways = airlines.getFlightDetails("WH4925");
        System.out.println(airways);
        List<Airways> result = airlines.findByCityAndStatus("Toronto", Status.DEPARTURE);
        System.out.println(result);
        Airways a = airlines.getEarliest();
        System.out.println(a);
    }
}
