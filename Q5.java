import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact =1;
        for(int i =1;i<=n;i++){
            fact = fact*i;
        }
        System.out.printf("The factorial of %d is %d ",n,fact);
    }
}
