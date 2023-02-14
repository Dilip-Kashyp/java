import java.util.Scanner;

public class swaping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int temp;
        System.out.println("Enter the number ");
        int a = sc.nextInt();

        System.out.println("Enter the number ");
        int b = sc.nextInt();

        System.out.println("before swaping "+ a +" "+ b );

        temp = a ;
        a = b ;
        b = temp;

        System.out.println("After swaping " + a +" "+ b);





    }
}
