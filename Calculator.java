import java.util.Scanner;

public class Calculator{
    public static void main(String[] args){
        System.out.println("Choose from one of the following operations: add, subtract, multiply, divide, alphabetize");

        System.out.print("Enter an operation: ");
        Scanner input = new Scanner(System.in);
        String operation = input.next().toLowerCase();

        Object[] arr = new Object[1];

        if(!operation.equals("add") && !operation.equals("subtract") && !operation.equals("multiply") && !operation.equals("divide") && !operation.equals("alphabetize")){
            System.out.println("Invalid input entered. Terminating...");
            return;
        }

        if(operation.equals("add") || operation.equals("subtract")){
            System.out.print("Please enter two integers: ");
            Integer num1 = input.nextInt();
            Integer num2 = input.nextInt();
            if(!(num1 instanceof Integer) || !(num2 instanceof Integer)){
                System.out.println("Invalid input entered. Terminating...");
                return;
            }
            switch(operation){
                case "add":
                arr[0] = num1 + num2;
                break;
                case "subtract":
                arr[0] = num1 - num2;
            }
        }

        else if(operation.equals("multiply") || operation.equals("divide")){
            System.out.print("Please enter two doubles: ");
            Double num1 = input.nextDouble();
            Double num2 = input.nextDouble();
            if(!(num1 instanceof Double) || !(num2 instanceof Double)|| (num2 == 0.0)){
                System.out.println("Invalid input entered. Terminating...");
                return;
            }
            switch(operation){
                case "multiply":
                arr[0] = num1 * num2;
                break;
                case "divide":
                arr[0] = num1 / num2;
            }
        }

        else if(operation.equals("alphabetize")){
            System.out.print("Enter two words: ");
            String word1 = input.next();
            String word2 = input.next();
            if(!(word1 instanceof String) || !(word2 instanceof String)){
                System.out.println("Invalid input entered. Terminating...");
                return;
            }
            
            int compare = word1.toLowerCase().compareTo(word2.toLowerCase());

            if(compare == 0) arr[0] = "Which came first, the chicken or the egg?";
            else if(compare > 0) arr[0] = word2 + " comes before " + word1 + " alphabetically.";
            else if(compare < 0) arr[0] = word1 + " comes before " + word2 + " alphabetically.";
        }
        
        if(arr[0] instanceof Double) System.out.printf("Answer: %.2f\n", arr[0]);
        
        else System.out.println("Answer: " + arr[0]);
        
    }

}