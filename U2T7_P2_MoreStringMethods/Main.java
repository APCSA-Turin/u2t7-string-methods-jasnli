package U2T7_P2_MoreStringMethods;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int wordCount = 0;
        int points = 0;
        String currentWord;
        String previouslyEnteredWord = "";
        Scanner scan = new Scanner(System.in);

        while (points < 50) {

            System.out.print("Enter your word: ");
            wordCount ++;
            currentWord = scan.nextLine();
            if (wordCount != 1) {
                if (currentWord.compareTo(previouslyEnteredWord) > 0) {
                    points += 2;
                    System.out.println("2 Points Earned, Current Points: " + points);
                } if (currentWord.compareTo(previouslyEnteredWord) < 0) {
                    points -= 5;
                    System.out.println("5 Points Lost, Current Points: " + points);
                } if (currentWord.equals(previouslyEnteredWord)) {
                    points -= 10;
                    System.out.println("10 Points Lost, Current Points: " + points);
                } if (previouslyEnteredWord.substring(previouslyEnteredWord.length() - 2).equals(currentWord.substring(0,2))) {
                    points += 5;
                    System.out.println("5 Points Earned, Current Points: " + points);
                } if (currentWord.indexOf(previouslyEnteredWord.substring(0,1)) >= 0) {
                    points += 3;
                    System.out.println("3 Points Earned, Current Points: " + points);
                } if (previouslyEnteredWord.length() == currentWord.length()) {
                    points += 5;
                    System.out.println("5 Points Earned, Current Points: " + points);
                }
            }

            previouslyEnteredWord = currentWord;
        }
        System.out.println("Game Over, You Win!");
        System.out.println("Words Used: " + wordCount);
        System.out.println("Points: " + points);

    }
}