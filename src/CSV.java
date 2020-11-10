import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class CSV {
    public File getFile(){
        File csvFile = new File("Contacts.csv");
        return csvFile;
    }
    public void writeToFile(ArrayList<Clients> myClients,File file){
        try {
            FileWriter fileWriter = new FileWriter(file);
            for (Clients a : myClients) {
                fileWriter.write(a.toString());
            }
            fileWriter.close();

            }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void readFile(File file){
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String data = fileReader.nextLine();
                System.out.println(data);
            }
            fileReader.close();
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
