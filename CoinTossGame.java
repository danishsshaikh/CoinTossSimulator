import java.util.Random;
import java.util.Scanner;

 
public class CoinTossGame {

    private enum Coin {
        Head, Tail
    };

    public static void main(String[] args) {
        CoinTossGame game = new CoinTossGame();
        game.startGame();
    }

    private void startGame() {

        Scanner scanner = new Scanner(System.in);
        Coin guess;

        while (true) {
            System.out.println("Enter your guess: h for heads, t for tails, q to quit");
            String choice = Scanner.nextLine();
            if (choice.equalsIgnoreCase(q)) {
                break;
            } else if (choice.equalsIgnoreCase(h)) {
                guess = Coin.Head;
            } else if (choice.equalsIgnoreCase(t)) {
                guess = Coin.Tail;
            } else {
                System.out.println("Wrong choice! Try again!");
                continue;
            }

            Coin toss = tossCoin();
            if (guess == toss) {
                System.out.println("Congratulations! You won the toss!");
            } else {
                System.out.println("Sorry! You lost the toss.");
            }

        }
        scanner.close();

    }

    
    private Coin tossCoin() {
        Random r = new Random();
        int i = r.nextInt(2);
        if (i == 0) {
            return Coin.Head;
        } else {
            return Coin.Tail;
        }
    }

}