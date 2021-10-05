import java.util.Random;

class Die {
    int value;
    int roll() {
        java.util.Random random = new java.util.Random();
        value = random.nextInt(6);
        value += 1;
 
        return value;
    } 
}