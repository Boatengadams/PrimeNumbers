package Loop;

import java.util.Scanner;

public class PrimeNumbers {
    static void main(String[] args) {
        prime();
    }
    public static void prime(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if is a prime number:");
        int userInput = input.nextInt();

        boolean isPrime = true;
        for(int i = 2; i<= userInput/2; i++)
            if(userInput % i == 0){
                isPrime = false;
                break;
            }
        System.out.println(isPrime? "Prime":"Not Prime");

    }
}
