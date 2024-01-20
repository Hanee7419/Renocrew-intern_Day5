import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        int sum =0;
        System.out.println("Enter value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<n;i++){
            sum = sum+(i*2);
        }
        System.out.println("Sum of n even numbers is: "+sum);
    }
}
