// Class for the tournament where fighters will execute moves and damage each other
import java.util.Scanner;

public class Tournament {

    public static void main(String[] args) {
        Fighter fighterOne = new Fighter();
        Fighter fighterTwo = new Fighter();


        System.out.println(fighterOne.fighterName);
        System.out.println("Health: " + fighterOne.fighterHealth);

        System.out.println(fighterTwo.fighterName);
        System.out.println("Health: " + fighterTwo.fighterHealth);

        // Take Damage
        fighterOne.doHighKick(fighterTwo);
        System.out.println("Damage!! \n" + fighterTwo.fighterName + "\nHealth: " + fighterTwo.fighterHealth);
    }
}