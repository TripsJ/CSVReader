import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CSVReader {
    public static List<String> linereader(String file) {
        List<String> content = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File(file));
            while(scanner.hasNextLine()){
                content.add(scanner.nextLine());
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }
        finally{
            return content;
        }
    }
    public static void main(String[] args){
       List <String> f = linereader("ford_escort.csv");
        System.out.println(f);


    }
}
