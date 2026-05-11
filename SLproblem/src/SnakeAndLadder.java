import java.util.Random;

public class SnakeAndLadder {
    static final int NO_PLAY = 0;
    static final int LADDER = 1;
    static final int SNAKE = 2;
    public static void main(String[] args) {
        System.out.println("Welcome to the snake and ladder game");
        int p1 = 0, p2 = 0;
        boolean isP1Turn = true;
        Random random = new Random();

        while (p1 < 100 && p2 < 100) {

            int dice = random.nextInt(6) + 1;
            int option = random.nextInt(3);

            if (isP1Turn) {
                int old = p1;

                switch (option) {
                    case LADDER:
                        p1 += dice;
                        break;
                    case SNAKE:
                        p1 -= dice;
                        break;
                }

                if (p1 < 0) p1 = 0;
                if (p1 > 100) p1 = old;

                System.out.println("P1: " + p1);

                if (option != LADDER) isP1Turn = false;

            } else {
                int old = p2;

                switch (option) {
                    case LADDER:
                        p2 += dice;
                        break;
                    case SNAKE:
                        p2 -= dice;
                        break;
                }

                if (p2 < 0) p2 = 0;
                if (p2 > 100) p2 = old;

                System.out.println("P2: " + p2);

                if (option != LADDER) isP1Turn = true;
            }
        }
    }
}
