
import java.util.Scanner;
public class taking_input {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);


         System.out.println("Enter the number ");
         int a = n.nextInt();
         System.out.println("Enter the number ");
         int b = n.nextInt();


         int sum = a+b;

         System.out.println("The sum of number is ");
         System.out.println(sum);

        boolean c = n.hasNextInt();
        System.out.println(c);

        String str = n.nextLine();
        System.out.println(str);
    }
}
