
import java.util.Scanner;
/*
Paul Cumbal; Dominix Barroso
 */
public class Switch {
    public static void main (String [ ]args){
        Scanner scanner = new Scanner(System.in);

        printAnyString ("Hi  you are the best program! The program has some options such as: A, B and C");
        printAnyString ("Please type any option");
        String readingString = scanner.nextLine();
        switch (readingString.toLowerCase()){
            case "a":
                printAnyString ("Now you are in sum program, it is necessary to type 2 numbers:");
                printAnyString ("Type the first number:");
                int numberOne = scanner.nextInt();
                printAnyString ("Type the second number:");
                int numberTwo = scanner.nextInt();
                int sumResult = sumNumbers(numberOne, numberTwo);

                printAnyString("The result of sum is: "+sumResult);

                break;

            case "b":
                printAnyString ("Now you are in the B option");
                printAnyString ("Type any phrase:");
                String phrase = scanner.nextLine();
                print = printPhrase(phrase);

                printAnyString("Your phrase is: "+ print);

                break;

            case "c":
                printAnyString ("Now you are in the option C, calculate the cosin of the number");
                printAnyString ("Enter any number:");
                int cosinNumber = scanner.nextInt();
                double resultCosin = cosin(cosinNumber);

                printAnyString("THe cosin of "+cosinNumber+" is: "+resultCosin);

                break;
        }
    }

    public static void printAnyString (String message){
        System.out.println(message);
    }
    public static void printPhrase (String phrase){
        System.out.println(phrase);
    }
    public static int sumNumbers (int numberOne, int numberTwo){
        int result = numberOne + numberTwo;
        return result;
    }
    public static double cosin (int cosinNumber){
        double resultCos = Math.cos(cosinNumber);
        return resultCos;
    }
}

