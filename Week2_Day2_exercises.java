package Week2.Day2;

import java.util.Scanner;

public class Week2_Day2_exercises {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner n = new Scanner(System.in);

        System.out.println("Enter your first number:");
        num1 = n.nextInt();

        System.out.println("Enter your Second number:");
        num2 = n.nextInt();

        System.out.println("Choose your operation :\n" +
                "1.( + )\n" +
                "2.( - )\n" +
                "3.( / )\n" +
                "4.( * )\n" +
                "5.( % )");

        String op = n.next();
        int total = 0;

        switch (op) {
            case "+":
                total = num1 + num2;
                System.out.println(num1+ "+"+ num2 +"="+total);
                break;

            case "-" :
                total = num1 - num2;
                System.out.println(num1+ "-"+ num2 +"="+total);
                break;

            case "/" :
                total = num1 / num2;
                System.out.println(num1+ "/"+ num2 +"="+total);
                break;

            case "*" :
                total = num1 * num2;
                System.out.println(num1+ "*"+ num2 +"="+total);
                break;

            case "%" :
                total = num1 % num2;
                System.out.println(num1+ "%"+ num2 +"="+total);
                break;
        }


    }//end
}// end
