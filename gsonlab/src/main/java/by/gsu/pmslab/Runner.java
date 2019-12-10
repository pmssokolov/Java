package by.gsu.pmslab;



import java.io.*;
import java.net.URL;


public class Runner {

    public static final int BUFFER_SIZE = 1024;
    public static final String PATH = "src/main/resources/in.json";
    public static final String URL = "http://api.openweathermap.org/data/2.5/weather?q=New%20York%20&mode=json%20&appid=71157ec6be432ca0a3fd4df79cd083c4";

    public static void main(String[] args) throws Exception {
        readUrl(URL);
        WorkWithHTML.workWithHTML();
    }


    private static void readUrl(String urlString) throws Exception {
        URL url = new URL(urlString);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(url.openStream());
        File file = new File(PATH);
        FileOutputStream fos = new FileOutputStream(file);

        int read;
        byte[] chars = new byte[BUFFER_SIZE];
        while ((read = bufferedInputStream.read(chars)) != -1) {
            //buffer.append(chars, 0, read);
            fos.write(chars,0,read);
        }
        fos.close();
        bufferedInputStream.close();

    }
}
