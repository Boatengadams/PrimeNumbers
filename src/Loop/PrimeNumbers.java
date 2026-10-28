// Question: Is the integer entered by the user a prime number?
package Loop;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        prime();
    }
    public static void prime(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if is a prime number:");
        int userInput = input.nextInt();

        boolean isPrime = userInput >= 2;
        for(int i = 2; isPrime && i<= userInput/2; i++)
            if(userInput % i == 0){
                isPrime = false;
                break;
            }
        System.out.println(isPrime? "Prime":"Not Prime");

    }
}
