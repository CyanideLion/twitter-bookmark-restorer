import org.json.*;

import java.io.*;

public class main {
    public static void main(String[] args) {

    }


    public JSONObject[] readObjects(String pathToFile) {
        try (FileReader fileReader = new FileReader(pathToFile)) {
            JSONTokener jsonTokener = new JSONTokener(fileReader);
            JSONObject jsonObject = new JSONObject(jsonTokener);

        } catch (FileNotFoundException e) {
            System.err.println("File not found. Check if the path is correct!");

        } catch (IOException e) {
            System.err.println("Unknown error occured!");
        }

        return null;
    }


}
