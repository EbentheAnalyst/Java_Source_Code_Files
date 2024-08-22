import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) 
    
    {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        // Question 1
        System.out.println("Question 1: What is the capital of France?");
        System.out.println("A) Berlin");
        System.out.println("B) Madrid");
        System.out.println("C) Paris");
        System.out.print("Your answer");
        char answer1 = scanner.next().toUpperCase().charAt(0);
        if (answer1 == 'C') {
            score++;
        }

        // Question 2
        System.out.println("Question 2: What is 2 + 2?");
        System.out.println("A) 3");
        System.out.println("B) 4");
        System.out.println("C) 5");
        System.out.print("Your answer: ");
        char answer2 = scanner.next().toUpperCase().charAt(0);
        if (answer2 == 'B') {
            score++;
        }

        // Question 3
        System.out.println("Question 3: What is the largest planet in our solar system?");
        System.out.println("A) Earth");
        System.out.println("B) Mars");
        System.out.println("C) Jupiter");
        System.out.print("Your answer: ");
        char answer3 = scanner.next().toUpperCase().charAt(0);
        if (answer3 == 'C') {
            score++;
        }

        // Output the final score
        System.out.println("You got " + score + " out of 3 correct!");

        scanner.close();
    }
}


