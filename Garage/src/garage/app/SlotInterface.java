package garage.app;

import javax.sound.midi.SysexMessage;
import java.lang.invoke.MethodHandle;
import java.util.Scanner;

public class SlotInterface {

//get infromation of one slot
    public Slot input(){
        Slot slot =new Slot();
        Scanner inp=new Scanner(System.in);
        System.out.println("enter slot width");
        int width=inp.nextInt();
        slot.setWidth(width);

        System.out.println("enter slot depth");
        int depth=inp.nextInt();
        slot.setDepth(depth);

        slot.setAvail(true);
        return slot;
    }


    //get information of all slots
    public void setUpSlots(){
        Scanner inp=new Scanner(System.in);
        System.out.println("enter number of slots");
        int size=inp.nextInt();
        SlotsDB SLOTS =new SlotsDB();
        System.out.println("enter slot configuration ,, press 1 for 'first come first served' " +
                                    "OR  2 for 'best-fit approach' ");
        int config=inp.nextInt();
        Method method =new Method();

        method.setConfig(config);


        VehicleEntry v =new VehicleEntry();

        //return object of Configuration based on integer 1 or 2
        v.setConf(method.getCurrent());

        for (int i=0;i<size;i++){
            System.out.println("enter information of slot number " + (i+1));
            SLOTS.getSlots().add(input());
        }

    }
    //print message to user if he can't park
    public void noAvailableSlots(){
        System.out.println("Sorry, There is no slot with dimensions");
    }



        //display available parking slots
    public void display() {
        boolean flag=false;
        System.out.println("Available slots : \n" );

        SlotsDB slots = new SlotsDB();
        for (Slot s : slots.getSlots()) {
            if (s.isAvail()) {
                flag=true;
                System.out.println(s.getId() + " ");
            }
        }

        if(!flag){
            System.out.println("There is no available slots, Garage is Full. \n");

        }

    }
        //display total income
    public void displayTotalIncome(){
        Income obj = new Income();
        System.out.println("Total income = " + obj.calcTotal() );
    }

    //display total number of vehicles

    public void displayTotalVehicles(){
        VehicleEntry v=new VehicleEntry();
        System.out.println("Total Number of vehicles= " +v.getTotal());;

    }

}
