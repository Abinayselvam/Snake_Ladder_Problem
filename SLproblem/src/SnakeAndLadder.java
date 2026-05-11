import java.util.Random;

public class SnakeAndLadder {
    public static void main(String[] args)
    {
        System.out.println("Welcome to the snake and ladder game");
        System.out.println("Roll the dice");
        Random random=new Random();
        int dice = random.nextInt(6)+1;
        System.out.println("Dice Rolled: "+dice);
    }
}
