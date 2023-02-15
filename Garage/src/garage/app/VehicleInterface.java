package garage.app;

import java.util.Scanner;

public class VehicleInterface {


    void FillIn(Vehicle v) {
        Scanner Input = new Scanner(System.in);
        System.out.println("enter vehicle name");
        String name;
        name=Input.nextLine();
        v.setName(name);


        System.out.println("enter vehicle model year");
        String model;
        model=Input.nextLine();
        v.setModelYear(model);


        System.out.println("enter vehicle id");
        int id;
        id=Input.nextInt();
        v.setId(id);



        System.out.println("enter vehicle width");
        int width;
        width=Input.nextInt();
        v.setWidth(width);

        System.out.println("enter vehicle depth");
        int depth;
        depth=Input.nextInt();
        v.setDepth(depth);

    }

    void printSelectedSlot(int id){

        System.out.println("Your slot id is "+ id);

    }



    void printFees(Vehicle v, int fees ){

        System.out.println("arrival time : " + v.getArrivalTime()+"\n"+
                            "departure time : " + v.getDepartureTime()+ "\n"+
                                "total fees = "+ fees );
    }


    void startParkIn(){
        VehicleEntry v = new VehicleEntry();
        v.ParkIn();
    }
    void startParkOut(){
        VehicleLeaving v= new VehicleLeaving();
        int id;
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter id of your car: ");
        id=Input.nextInt();
        v.parkOut(id);
    }

    void noSuchCar(){
        System.out.println("No such car with this id ,, please enter correct id. ");
    }




}
