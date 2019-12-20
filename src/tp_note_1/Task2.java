package tp_note_1;
import java.util.Scanner;

public class Task2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sec,min,hour,input;
        System.out.println("Program for converting seconds into formated H:M:S");
        System.out.println("\tInput number of seconds :");
        input=sc.nextInt();
        sec=input%60;
        min=input/60;
        hour=min/60;
        if(min>=60){
            min=min%60;
        }        
        
            System.out.println("Time corresponding to"+input+"seconds"+hour+":"+min+":"+sec);
        
        


        
    }
}