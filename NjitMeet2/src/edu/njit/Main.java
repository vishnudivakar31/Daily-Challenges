package edu.njit;

public class Main {

    public static void main(String[] args) {
	    System.out.println(solve(378));
    }

    static int solve(int n) {
        int sumPrimeNumbers = 0, sumDigits = 0;
        int temp1 = n, temp2 = n;
        while(temp1 != 0) {
            sumDigits += (temp1 % 10);
            temp1 /= 10;
        }
        while(temp2 % 2 == 0) {
            sumPrimeNumbers += 2;
            temp2 /= 2;
        }
        for(int i = 3; i < Math.sqrt(temp2); i = i + 2) {
            while(temp2 % i != 0) {
                sumPrimeNumbers += i;
                temp2 /= i;
            }
        }
        return sumPrimeNumbers == sumDigits ? 1 : 0;
    }
}
