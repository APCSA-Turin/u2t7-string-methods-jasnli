import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word1;
        String word2;

        System.out.println("Enter word 1: ");
        word1 = scan.nextLine();
        System.out.println("Enter word 2: ");
        word2 = scan.nextLine();

        if (word1.length() > word2.length()) {
            System.out.println("Word 1 is longer.");
        } if (word2.length() > word1.length()) {
            System.out.println("Word 2 is longer.");
        } if (word2.length() == word1.length()) {
            System.out.println("The words are the same length!");
        }

        String word1Half1 = word1.substring(0, (word1.length() / 2));
        String word1Half2 = word1.substring((word1.length() / 2));
        String word2Half1 = word2.substring(0, (word2.length() / 2));
        String word2Half2 = word2.substring((word2.length() / 2));
        System.out.println("First Half: " + word1Half1);
        System.out.println("Second Half: " + word1Half2);
        System.out.println("First Half: " + word2Half1);
        System.out.println("Second Half: " + word2Half2);


        if (word1.indexOf(word2) != -1) {
            System.out.println("Word 2 is found at index " + word1.indexOf(word2) + " word 1.");
        } else {
            System.out.println("Word 2 not in word 1.");  
        }
    }
}