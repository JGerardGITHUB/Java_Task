import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

 class MyFileReader {
    public void readFile(String fileName) {
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            
             fr.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("Error: File not found. Please make sure the file exists and try again.");
        }
        catch (IOException e) {
            System.out.println("Error: An error occurred while reading the file.");
        }
    }
}
public class tasksheet_1_1_13 {
    public static void main(String[] args) {
        MyFileReader fileReader = new MyFileReader();
        String fileName = "sample.txt"; // Provide the file name to read
        System.out.println("Reading data from file...");
        try {
            fileReader.readFile(fileName);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

