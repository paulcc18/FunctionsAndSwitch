import java.util.Scanner;
/*
Integers: Paul Cumbal & Dominix Barroso
 */
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        printAnyString("Hi, you are the best program! The program has some options such as: A, B and C");
        printAnyString("Please type any option: A/B/C");
        String readingString = scanner.nextLine().toLowerCase();
        switch (readingString) {
            case "a":
                printAnyString("Now you are in the sum program. It is necessary to type 2 numbers:");
                printAnyString("Type the first number:");
                int numberOne = scanner.nextInt();
                scanner.nextLine();
                printAnyString("Type the second number:");
                int numberTwo = scanner.nextInt();
                int sumResult = sumNumbers(numberOne, numberTwo);
                printAnyString("The result of sum is: " + sumResult);
                break;
            case "b":
                printAnyString("Now you are in the B option");
                printAnyString("Type any phrase:");
                String phrase = scanner.nextLine();
                printAnyString("Your phrase is: "+phrase);
                break;
            case "c":
                printAnyString("Now you are in the option C, calculate the cosine of the number");
                printAnyString("Enter any number:");
                int cosinNumber = scanner.nextInt();
                double resultCosin = cosin(cosinNumber);

                printAnyString("The cosine of " + cosinNumber + " is: " + resultCosin);
                break;
        }
    }

    public static void printAnyString(String message) {
        System.out.println(message);
    }

    public static int sumNumbers(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public static double cosin(int cosinNumber) {
        return Math.cos(cosinNumber);
    }
}
