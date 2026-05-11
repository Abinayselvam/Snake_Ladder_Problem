import java.util.Random;

public class SnakeAndLadder {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;

    public static void main(String[] args)
    {
        System.out.println("Welcome to the snake and ladder game");

        int position = 0;

        Random random=new Random();
        int dice = random.nextInt(6) + 1;
        int option = random.nextInt(3);

        System.out.println("Dice: " + dice + " | Option: " + option);

        switch (option) {
            case LADDER:
                position += dice;
                break;
            case SNAKE:
                position -= dice;
                break;
        }

        if (position < 0) position = 0;

        System.out.println("Player Position: " + position);
    }

}
