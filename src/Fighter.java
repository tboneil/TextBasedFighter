// Fighter class contains fighter information

import java.util.Scanner;

public class Fighter {
    String fighterName;
    int fighterHealth;
    final int highPunch = 20;
    final int lowPunch = 10;
    final int highKick = 25;
    final int lowKick = 15;

    // Fighter constructor
    public Fighter() {
        Scanner scanner = new Scanner(System.in);

        // Fighter info
        fighterHealth = 100;

        System.out.print("Fighter Name: ");
        fighterName = scanner.next();

    }

    public void doHighPunch(Fighter fighter) {
        fighter.fighterHealth -= highPunch;
    }

    public void doLowPunch(Fighter fighter) {
        fighter.fighterHealth -= lowPunch;
    }

    public void doHighKick(Fighter fighter) {
        fighter.fighterHealth -= highKick;
    }

    public void doLowKick(Fighter fighter) {
        fighter.fighterHealth -= lowKick;
    }
}
