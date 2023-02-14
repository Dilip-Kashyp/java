import java.util.Scanner;
public class stirngmethod {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name ");
            String  name = sc.nextLine();

            int la = name.length();
            System.out.println( "total number of case is " + la);

            String strl = name.toLowerCase();
            System.out.println(strl);

            String stru = name.toUpperCase();
            System.out.println(stru);

            String trm = name.trim();
            System.out.println(trm);







    }
}