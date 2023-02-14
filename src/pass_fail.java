import java.util.Scanner;

public class pass_fail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks sub1");
        int sub1 = sc.nextInt();

        System.out.println("Enter the marks sub1");
        int sub2 = sc.nextInt();

        System.out.println("Enter the marks sub1");
        int sub3 = sc.nextInt();

        float per = (sub1+sub2+sub3)/3.0f;

        if(per>40 && sub1>33 && sub2>33 && sub3>33) {
            System.out.println("you are pass");
        }
        else{
            System.out.println("fail");
        }
    }
}
