package package1;

import java.util.Scanner;
import java.util.ArrayList;

public class BusDemo {
    public static void main(String[] args) {
        ArrayList<Bus> buses= new ArrayList<Bus>();
        ArrayList<Booking> booking=new ArrayList<Booking>();

        
        buses.add(new Bus(1, true, 5));
        buses.add(new Bus(2, true,2 ));
        buses.add(new Bus(3, true, 6));
        buses.add(new Bus(4, true, 4));
        buses.add(new Bus(5, true, 10));

        for(Bus b:buses){
            b.dispBus();
        }
 
        int useOp=1;
        Scanner scan=new Scanner(System.in);
        while(useOp==1){
            System.out.println("Enter 1 to book and 2 to exit");
            useOp=scan.nextInt();
            if(useOp==1){
                Booking booking2= new Booking();
                if(booking2.isAvailable(booking,buses)){
                    booking.add(booking2);
                    System.out.println("Your booking is confirmed");
                }
                else{
                    System.out.println("Booking not available ");
                }

            }
        }

    }
    
}
