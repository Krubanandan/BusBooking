package package1;

import java.util.Scanner;

class Book{
    int n;
    String name;
    Book(){
        Scanner scan=new Scanner(System.in);
        n=scan.nextInt();
        name=scan.next();
    }

    public void disp(){
        System.out.println("number "+n+" name "+name);
    }
   
}


public class Simple {
    public static void main(String[] args) {
        Book booking=new Book();
        booking.disp();
    }

    
}
