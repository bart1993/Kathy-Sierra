
import java.io.*;
import java.io.IOException;

/**
 * Created by bart on 02.06.16.
 */
public class GameHelper {
    public String getUserInput(String promt){
        String inputLine = null;
        System.out.println(promt + " ");

        try {
            BufferedReader is = new BufferedReader(new InputStreamReader(System.in));
            inputLine = is.readLine();
            if (inputLine.length() == 0) return null;
        } catch (IOException e){
            System.out.println("IOException: " + e);
        }
        return inputLine;
    }
}
