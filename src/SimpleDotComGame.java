/**
 * Created by bart on 02.06.16.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {


        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();


        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);

        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;


        while (isAlive == true) {
            String guess = helper.getUserInput("Vvedite Chislo");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;

            if (result.equals("Potopil")) {
                isAlive = false;
                System.out.println("Vam Potrebovalos" + " " + numOfGuesses + " " + "Popitock");
            }
        }
    }
}
