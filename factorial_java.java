/*So this is one of my first Java codes It's quite simple; just crunches out the factorial of a number.*/

import java.util.Scanner;
public class facto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        long factorial;
        factorial = 1;
        System.out.println("Please enter the number for which you want to find the factorial: ");
        num = scanner.nextInt();
        if (num == 0 || num == 1) {
            System.out.println("The factorial of "+num+" is 1.");
        }
        else {
            for (int i = 1; i <= num; i++) {
                factorial*=i;
            }
            System.out.println("The factorial of "+num+" is "+factorial+".");
            scanner.close();
        }

    }
    
}

