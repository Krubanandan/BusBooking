package package1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Booking {
    String passengerName;
    int busNo;
    Date date;

    Booking(){
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter name of passenger");
        passengerName=scan.next();
        System.out.println("Enter bus no:");
        busNo=scan.nextInt();
        System.out.println("Enter date dd-mm-yyyy");
        String datein=scan.next();

        SimpleDateFormat dateFor=new SimpleDateFormat("dd-MM-yyyy");
        
        try {
            date=dateFor.parse(datein);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public boolean isAvailable(ArrayList<Booking> booking,ArrayList<Bus> buses){
        int capacity=0;
        for(Bus bus:buses){
            if(bus.getBusno()==busNo){
                capacity=bus.getCap();
            }    
        }
        int booked=0;
        for(Booking b:booking){
            if(b.busNo==busNo && b.date.equals(date)){
                booked++;
            }
        }
        return booked<capacity?true:false;
    }
}
