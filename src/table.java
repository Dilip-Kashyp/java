import java.util.Scanner;
public class table {
    static int a = 1;
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter the table ");
         int num = sc.nextInt();

        table(num);

    }
    static void table(int num){

        if(a<=10){

            System.out.println(num + "X" + a + "=" +num*a);
            a++;
            table(num);

        }}
}
