import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    public static void main(String[] args) {
        String[] names = {"John", "Jenny", "Tom"};
        
        // Writing to a file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\n1cit\\OneDrive - Cape Peninsula University of Technology\\Documents\\2KRONOS\\JAVA\\Java-Learning-Journey\\Uni Java\\Reading and Writing\\new location\\Output.txt"))) {
            writer.write("Writing to a file");
            writer.write("\nHere is another line");
            
            for (String name : names) {
                writer.write("\n" + name);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Reading from a file
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\n1cit\\OneDrive - Cape Peninsula University of Technology\\Documents\\2KRONOS\\JAVA\\Java-Learning-Journey\\Uni Java\\Reading and Writing\\new location\\Output.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
