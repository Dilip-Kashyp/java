import java.util.Scanner;
import java.util.Random;
public class rock_paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        boolean result ;
        int compt = rand.nextInt(4);

        if(compt == 0){
            compt = 'r';
        }
        else  if(compt == 1){
            compt = 'p';
        }
        else  if(compt == 2){
            compt = 's';
        }
        else{
            System.out.println("invalid input from cp");
        }


        System.out.println("press Rock(r) : Paper(p) : sicssor(s) ");
        char player = sc.next().charAt(0);

        if(compt==player){
            System.out.println("tie");
        }
        else if (compt=='r'){
            if(player=='s') {
                result = false;
            }
            else if(player=='p'){
                result = true;
            }}
        else if (compt=='p'){
            if(player=='s') {
                result = false;
            }
            else if(player=='r'){
                result = true;
            }}

        else if (compt=='s'){
            if(player=='p') {
                result = false;
            }
            else if(player=='p'){
                result = true;
            }}





        }
}
