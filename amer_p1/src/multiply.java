import java.util.Random;
import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        // variable declaration
        int correctAns, answer;
        String choice;
        //Scanner to take inputs
        Scanner sc = new Scanner(System.in);
        do {
            //Calling the method to generate question
            correctAns = generateQuestionAndAnswer();
            do {
                //Asking for guess
                System.out.print("\nYour answer: ");
                answer = sc.nextInt();
                //Checking if the answer is right
                if (answer == correctAns) {
                    System.out.println("Very Good!");
                } else {
                    System.out.println("No. Please try again.>again.");
                }
            } while (answer != correctAns);
            //Asking if student wants one more question?
            System.out.println("Try another question? (y or n) ");
            choice = sc.next();
        }
        while (choice.equalsIgnoreCase("y"));
    }

    //method to generate question
    public static int generateQuestionAndAnswer() {
        int num1, num2;
        //initializing random variable
        Random rand = new Random();
        //Generating randoms less than 10
        num1 = rand.nextInt(10);
        num2 = rand.nextInt(10);

        System.out.print("How much is " + num1 + " times " + num2 + "?");

        return num1 * num2;
    }
}

