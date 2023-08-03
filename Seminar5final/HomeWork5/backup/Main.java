import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

            File dir = new File("src");
            File[] arrFiles = dir.listFiles();
            String[] addres =  arrFiles[0].toString().split("\\\\");

        try {
            backupcopy(Path.of("backup"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }



    public static void backupcopy(Path destination) throws IOException {
        File dir = new File("src");
        File[] arrFiles = dir.listFiles();
        for (int i = 0; i <arrFiles.length ; i++) {
            String[] addres =  arrFiles[i].toString().split("\\\\");
            Files.copy(arrFiles[i].toPath(), Path.of(String.format("%s/%s", destination, addres[addres.length - 1])));
        }
    }




}