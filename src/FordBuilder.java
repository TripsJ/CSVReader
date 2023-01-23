import java.util.ArrayList;

public class FordBuilder {
    public FordBuilder(){

    }
    public void converted(String e){
        String[]content =e.split(",");
        System.out.println(content[0]);
        System.out.println(content[1]);
        System.out.println(content[2]);
    }

    private FordModel makeEntry(String e){
        String[]entry = e.split(",");
        for (int i = 0; i < entry.length; i++) {
            entry[i] = entry[i].replaceAll("\\s", "");

        }
        return new FordModel(Integer.parseInt(entry[0]),Integer.parseInt(entry[1]),Float.parseFloat(entry[2]));

    }

    public ArrayList<FordModel> buildFleet(ArrayList<String> input){
        ArrayList<FordModel> cars = new ArrayList<>();
        input.forEach(e->cars.add(makeEntry(e)));
        return cars;
    }
}
