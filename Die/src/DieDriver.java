import java.util.Random;

public class DieDriver {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
 
        Die die = new Die(); 
 
        int dice1 = 0; 
 
        while (true) {
            int dice2 = die.roll(); 
            System.out.println(dice1 + " // " + dice2);
            dice1 = dice2;
            dice2 = die.roll();
            System.out.println(dice1 + " // " + dice2);
 
            if (dice1 == dice2) {
                break;
            }
        }
    }
}