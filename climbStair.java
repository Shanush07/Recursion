import java.util.*;
public class climbStair {
    public int getResult(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
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
        climbStair cs1 = new climbStair();
        System.out.println(cs1.getResult(n));

    }
}
