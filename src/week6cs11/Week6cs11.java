package week6cs11;

import java.util.Scanner;

public class Week6cs11 {
    public static void main(String[] args) {
        //task 1:
          int num1, num2;
          String input;
          
          Scanner keyboard = new Scanner(System.in);
          System.out.println("Do you want to play?");
          input = keyboard.nextLine();
          char again = input.charAt(0);
          while (again == 'y' || again == 'Y'){
              System.out.println("Enter a number: ");
              num1 = keyboard.nextInt();
              System.out.println("Enter another number: ");
              num2 = keyboard.nextInt();
              System.out.println("Their sum is " + (num1 + num2));
              System.out.println("Do you want to do this again? ");
              keyboard.nextLine();
              input = keyboard.nextLine();
              again = input.charAt(0);
          }
        //task 2:
            int count = 1, total = 0;
            while (count <= 100){
                total = count + total;
                count++;
            }
            System.out.print("The sum of the numbers 1 - 100 is ");
            System.out.println(total);
    }
    
}
