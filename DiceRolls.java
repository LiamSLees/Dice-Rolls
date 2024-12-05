import java.util.Scanner;
import java.util.Random;
public class DiceRolls {

    public class Dice {
        private Random random;

        public Dice() {
            this.random = new Random();
        }

        public int roll() {
            return random.nextInt();
        }
    }

    public void main(String[] args) {
        Scanner scnr = new Scanner (System.in);

        System.out.println("Enter how many rolls: ");

        int n = scnr.nextInt();

        final int numrolls = n;

        Dice dice = new Dice();


        int count = 0;

        for (int i = 0; i < numrolls; i++) {
            int roll = dice.roll();


           //counter
            if (roll == 5) {
                count++;
            }
        }


        double probability = (double) count / numrolls;

        System.out.println(probability + " = probablity per " + n + " rolls");
    }
}

