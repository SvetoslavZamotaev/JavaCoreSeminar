import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {

//        try {
//            backupcopy(Path.of("backup"));
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

        int[] fieldcode = {1,0,2,1,0,2,1,2,1};
        writeGameField(fieldcode);
        readTheField();




    }

    public static void writeGameField(int[] fieldcode){
        try(BufferedWriter buf = new BufferedWriter(new FileWriter("trying.txt"));) {
            int countNextline  = 0;
            for (int i = 0; i < fieldcode.length ; i++) {
                buf.write(parseToSimbol(fieldcode[i]));
                countNextline++;
                if (countNextline>2){
                    buf.newLine();
                    countNextline = 0;
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String parseToSimbol(int num){
        if(num == 0){
            return "O ";
        }
        else if(num == 1){
            return "X ";
        }
        else if(num == 2){
            return "empty ";
        }
        return "error";
    }

    public static void readTheField(){
        try(BufferedReader read = new BufferedReader(new FileReader("trying.txt"))){
            while(read.ready()){
                System.out.println(read.readLine());
            }
        }catch (IOException e){
            e.printStackTrace();
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