/**
 * Created by bart on 02.06.16.
 */
public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {2,3,4};
        dot.setLocationCells(locations);


        String userGuess = "5";
        String result = dot.checkYourself (userGuess);

    }
}