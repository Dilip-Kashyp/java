public class patren1 {
    public static void main(String[] args) {


        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.printf("%c",'A'-1+i);
            }
            System.out.println();

        }
    }
}