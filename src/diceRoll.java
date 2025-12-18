import java.util.*;

public class diceRoll {
    static java.util.Random rng = new Random();

    public static void main(String[] args){
        System.out.println(rng.nextInt(1,7));
    }
}
