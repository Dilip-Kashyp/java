
import java.util.Scanner;
public class pract1 {
    public static void main(String[] args) {

        // kilometer to miles conveter

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the distence in kilometter ");
        float dis = sc.nextInt();

        float mils = dis*0.6213719f ;

        System.out.println(mils +" miles in "+ dis +" kilometer");





    }
}
