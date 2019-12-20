package tp_note_1;
import java.util.Scanner;

public class Task3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sec,min,hour;
        System.out.println("Program for converting time to seconds.");
        System.out.println("\tPlease input hours:");
        hour=sc.nextInt();

        System.out.println("\tPlease input minutes:");
        min=sc.nextInt();
        System.out.println("\tPlease input seconds:");
        sec=sc.nextInt();
        System.out.println("----------------------------------------------");
        int result=hour*3600+min*60+sec;
        System.out.println("Number of seconds ="+hour+"x3600"+ "+"+min+"x60"+ "+"+ sec+"="+result);
        
        
    }
}