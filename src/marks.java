
import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner mark = new Scanner(System.in);

        System.out.println("Enter the marks of Math");
        int math = mark.nextInt();

        System.out.println("Enter the marks of English");
        int english = mark.nextInt();

        System.out.println("Enter the marks of Hindi");
        int hindi = mark.nextInt();

        System.out.println("Enter the marks of Account");
        int account = mark.nextInt();

        System.out.println("Enter the marks of Computer");
        int computer = mark.nextInt();

        int sum = (math + english + hindi + account + computer );
        float per = (sum / 500f*100);

        System.out.println("Your total percantage is " + per + "%");









    }
}
