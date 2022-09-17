package basic;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 0;
        String operator;
        do {
            try {
                System.out.print("Enter First Number :");
                num1 = new Scanner(System.in).nextInt();
            } catch (Exception e) {
                System.out.println("(!Please Enter Number Only)");
            }
        } while (num1 == 0);
        do {
            try {
                System.out.print("Enter Second Number :");
                num2 = new Scanner(System.in).nextInt();
            } catch (Exception e){
                System.out.println("(!Please Enter Number Only");
            }
        } while (num2 == 0);
        do {
            System.out.print("Enter Operator (+ - * /) :");
            operator = new Scanner(System.in).nextLine();
        } while (sgin(operator));

        // change from warning
        switch (operator) {
            case "+" -> System.out.println(num1 + num2);
            case "-" -> System.out.println(num1 - num2);
            case "*" -> System.out.println(num1 * num2);
            case "/" -> System.out.println(num1 / num2);
            default -> System.out.println("Enter Valid Operator(+  -  *  /) :");
        }
        /* The code I wrote
          if (operator.equals("+")){
                      System.out.println(num1+num2);
                  } else if (operator.equals("-")) {
                      System.out.println(num1-num2);
                  } else if (operator.equals("*")) {
                      System.out.println(num1*num2);
                  } else if (operator.equals("/")){
                      System.out.println(num1/num2);
                  } else {
                      System.out.println("Enter Valid Operator(+  -  *  /) :");
                  }
         */
    }
    public static boolean sgin(String str){
        if (str.equals("+")){
            return false;
        } else if (str.equals("-")){
            return false;
        } else if (str.equals("*")) {
            return false;
        } else if (str.equals("/")) {
            return false;
        } else {
            return true;
        }
    }
}
