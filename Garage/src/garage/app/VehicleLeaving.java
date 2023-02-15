package garage.app;

public class VehicleLeaving {


    void parkOut(int id){
        boolean flag=false;
        VehicleInterface vi = new VehicleInterface();
        Vehicle lVehicle = new Vehicle();
        SlotsDB slots = new SlotsDB();
        VehiclesDB vehicles = new VehiclesDB();
        for (Vehicle v : vehicles.getVehicles()){
            if(v.getId()==id) {
                flag=true;
                lVehicle=v;
                break;
            }
        }
        if(!flag){
            vi.noSuchCar();
            return;
        }
        // make slot free

        for (Slot s: slots.getSlots() ) {
            if(s.getId()==lVehicle.getSlotId()) {
                s.setAvail(true);
            }
        }

        //remove vehicle from arrayList and mark its departure time
        vehicles.getVehicles().remove(lVehicle);

        Time time = new Time();
        time.markDepartureTime(lVehicle);

        //calculate total fees
        Income fees= new Income();
        int f =fees.calcFees(lVehicle);


        //print total fees to user

        vi.printFees(lVehicle,f);


    }

}
