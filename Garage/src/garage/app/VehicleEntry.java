package garage.app;

import java.util.ArrayList;

public class VehicleEntry {
        private static Configuration conf;
        private static int total;

    public  void setConf(Configuration conf) {
        VehicleEntry.conf = conf;
    }

    public void ParkIn(){


        Vehicle vehicle = new Vehicle();
        VehicleInterface inter = new VehicleInterface();
        inter.FillIn(vehicle);
        SlotsDB slots = new SlotsDB();
        SlotInterface s =new SlotInterface();
        //
        if(conf.parkMethod(vehicle,slots.getSlots())==false){
            s.noAvailableSlots();
            return;

        }

        Time time = new Time();
        time.markArrivalTime(vehicle);



        VehiclesDB vehicles=new VehiclesDB();
        vehicles.getVehicles().add(vehicle);
        VehicleInterface vi =new VehicleInterface();
        vi.printSelectedSlot(vehicle.getSlotId());

        ++total;

    }

    public int getTotal() {
        return total;
    }
}
