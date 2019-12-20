package tp_note_1;
import java.util.Scanner;

public class Task4{
    public static void main(String[] args) {
        
        int sec,min,hour,esec,emin,ehour;
        int total,etotal;
        int amount;
        double price;
        Scanner sc = new Scanner(System.in);
        System.out.println("Program for calculating");
        System.out.println("\tPlease input start hours:");
        hour=sc.nextInt();
        System.out.println("Please input start minutes:");
        min=sc.nextInt();
        System.out.println("Please input start seconds:");
        sec=sc.nextInt();
        System.out.println("\n\n");
        System.out.println("Please inpu end hours:");
        ehour=sc.nextInt();
        System.out.println("Please inpu end minutes:");
        emin=sc.nextInt();
        System.out.println("Please inpu end seconds:");
        esec=sc.nextInt();
        total=hour*3600+min*60+sec;
        etotal=ehour*3600+emin*60+esec;
        amount=etotal-total;
        price=amount*0.05/60;

       int callsecond=amount%60;
        int callminute=amount/60;
        int callhour=callminute/60;
        if(callminute>=60){
            callminute=callminute%60;
        }    
        System.out.println("----------------------------------------");    
        
            System.out.println("Total call duration:"+amount+"seconds"+callhour+"h "+callminute+"mn "+callsecond+"s");
            System.out.println("Total cost of this call:"+price+"$");




    }
}