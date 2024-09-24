import java.util.*;
public class factorial {
    public int mul(int n){
        if(n==1){return 1;}
        int recursiveCall = mul(n-1);
        int smallCalc = n * recursiveCall;
        return smallCalc;
    }
    public static void main(String [] args){
        System.out.println("Enter n: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        factorial s1 = new factorial();
        System.out.println("Result: "+s1.mul(n));
    }
}
