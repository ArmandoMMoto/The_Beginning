/*So this is one of my first Java codes It's quite simple; just crunches out the factorial of a number.*/

import java.util.Scanner;
public class facto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        long factorial;
        factorial = 1;
        System.out.println("Por favot ingresa el número del cuál quieras su factorial: ");
        num = scanner.nextInt();
        if (num == 0 || num == 1) {
            System.out.println("El factorial de "+num+" es 1.");
        }
        else {
            for (int i = 1; i <= num; i++) {
                factorial*=i;
            }
            System.out.println("El factorial de "+num+" es "+factorial+".");
            scanner.close();
        }

    }
    
}

