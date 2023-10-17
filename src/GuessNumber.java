import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Random random = new Random();
        int minNumber = 0;
        int maxNumber = 10;
        int guessedNumber = random.nextInt(maxNumber - minNumber + 1) + minNumber;

        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        System.out.println("Введіть число від " + minNumber + " до " + maxNumber + ". Ви маєте " + attempts + " спроби.");

        for (int attempt = 1; attempt <= attempts; attempt++) {
            System.out.print("Спроба " + attempt + ": Введіть свій варіант: ");
            int userGuess = scanner.nextInt();

            if (userGuess < minNumber || userGuess > maxNumber) {
                System.out.println("Введене число не входить в діапазон.");
            } else if (userGuess == guessedNumber) {
                System.out.println("Успіх! Загадане число - " + guessedNumber);
                break;
            } else {
                System.out.println("Ви не вгадали. Залишилось спроб: " + (attempts - attempt));
            }
        }
    }
}

