package tp_note_1;
import java.util.Scanner;

public class Task5{

    public static void main(String[] args) {
        double riel;
        double dollar;
        Scanner sc= new Scanner(System.in);

        System.out.println("Program for converting money in Riels to Dollars. \n");
        System.out.println("Conversion rate is : 1 USD=4000 RIELS");
        System.out.println("Please input money in Riels : ");
        riel=sc.nextInt();
        dollar=riel/ 4000;
        System.out.println("---------------------------------------------------");

        System.out.println(riel+" RIELS="+dollar+"USD");


    }
}