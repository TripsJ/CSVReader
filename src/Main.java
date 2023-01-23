import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        CSVReader reader = new CSVReader("ford_escort.csv");
        ArrayList<String> lines = reader.readlines();
        System.out.println(lines);

        FordBuilder builder = new FordBuilder();
        builder.converted(lines.get(0));
        ArrayList<FordModel> cars = builder.buildFleet(lines);
        System.out.println(cars.get(0).getMileage());
        System.out.println(cars.get(0).getYear());
        System.out.println(cars.get(0).getPrice());
        }
    }

