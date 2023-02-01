package DataLoader;

import com.google.gson.Gson;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DataLoader {
    public static IData loadData(String name) throws IOException {
        Gson gson = new Gson();

        String currentDirectory = new File("").getAbsolutePath();
        String pathToFile = currentDirectory + "/" + name;
        System.out.println("Reading file: " + pathToFile);

        IData data = gson.fromJson(new FileReader(pathToFile), IData.class);

        return data;
    }
}
