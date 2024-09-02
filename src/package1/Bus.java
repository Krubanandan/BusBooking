package package1;

public class Bus {
    private int busno;
    private boolean ac;
    private int capacity;

    Bus(int busno,boolean ac,int capacity){
        this.busno=busno;
        this.ac=ac;
        this.capacity=capacity;

    }

    public int getCap(){
        return capacity;
    }

    public void setCap(int capacity){
        this.capacity=capacity;

    }
    
    public int getBusno(){
        return busno;
    }

    public boolean isAc(){ //accesoor
        return ac;
    }

    public void setAc(boolean ac){ //mutattors
        this.ac=ac;

    }

    public void dispBus(){
         System.out.println("Bus No "+busno+"Capacity "+capacity+"Ac "+ac);
    }

}
