import java.util.*;

public class sumNumbers{
    public int sum(int n){
        if(n==1){return 1;}
        int recursiveCall = sum(n-1);
        int smallCalc = n + recursiveCall;
        return smallCalc;
    }

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = scanner.nextInt();
        scanner.close();
        sumNumbers s1 = new sumNumbers();
        System.out.println("Result: "+s1.sum(n));
    }
} 