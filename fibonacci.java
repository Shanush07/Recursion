import java.util.*;
public class fibonacci {
    public int getResult(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int recursiveCall1 = getResult(n-1); 
        int recursiveCall2 = getResult(n-2);
        int smallCalc = recursiveCall1 + recursiveCall2;
        
        return smallCalc;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter: ");
        int n = scanner.nextInt();
        scanner.close();
        fibonacci f1 = new fibonacci();
        System.out.println(f1.getResult(n));

    }
}
