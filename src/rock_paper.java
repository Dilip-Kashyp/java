import java.util.Scanner;
import java.util.Random;
public class rock_paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int result=-1;
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
                result = 0;
            }
            else if(player=='p'){
                result = 1;
            }}
        else if (compt=='p'){
            if(player=='s') {
                result = 0;
            }
            else if(player=='r'){
                result = 1;
            }}

        else if (compt=='s'){
            if(player=='r') {
                result = 0;
            }
            else if(player=='p'){
                result = 1;
            }}
        if(result==0){
            System.out.println("you win");
        }
        else{
            System.out.println("you losss");
        }


        System.out.println("computer = " + (char)compt);





        }
}
