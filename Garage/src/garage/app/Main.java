package garage.app;

import java.util.Scanner;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome Owner, please setup your garage");
        SlotInterface si=new SlotInterface();
        si.setUpSlots();
        VehicleInterface vi=new VehicleInterface();

        while (true){
            int user;
            System.out.println(
                    "Please enter which kind of user you are: \n" +
                    "1- Owner \n"+
                    "2- Driver \n"+
                    "3- close program \n"
            );

            Scanner userInput = new Scanner(System.in);
            user=userInput.nextInt();
            if(user==1){
                while(true){
                    int owner;
                    System.out.println(
                            "Owner Menu: \n" +
                            "1-Display Available slots: \n" +
                            "2- Calculate total income \n" +
                            "3-Calculate total number of vehicles \n" +
                            "4- Exit \n"

                    );
                    Scanner ownerInput= new Scanner(System.in);
                    owner = ownerInput.nextInt();
                    if(owner==1) {
                            si.display();
                    }
                    else if (owner==2){
                        si.displayTotalIncome();
                    }
                    else if(owner==3){
                        si.displayTotalVehicles();
                    }
                    else if(owner==4) {
                        break;
                    }
                    else {
                        System.out.println("invalid choice, Try again \n");
                    }



                }

            }
            else if (user==2){

                while (true){
                    int driver;
                    System.out.println(
                            "Driver Menu: \n" +
                             "1-park in \n" +
                             "2-park out \n" +
                             "3-exit \n"
                    );
                    Scanner driverInput= new Scanner(System.in);
                    driver = driverInput.nextInt();

                    if(driver==1){
                        vi.startParkIn();
                    }
                    else if (driver==2){
                        vi.startParkOut();
                    }
                    else if (driver==3){
                        break;
                    }
                    else {
                        System.out.println("invalid choice, Try again \n");

                    }



                }

            }
            else if(user==3) {
                return;
            }
            else {
                System.out.println("invalid choice, Try again \n");

            }

        }

    }


}