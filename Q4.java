import java.util.Scanner;
public class Q4 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =10;i>0;i--){
            System.out.printf("%d X %d = %d\n",n,i,n*i);
        }
    }
}
