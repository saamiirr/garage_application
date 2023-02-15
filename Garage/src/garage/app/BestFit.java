package garage.app;

import java.util.ArrayList;

public class BestFit implements Configuration{
    public boolean parkMethod(Vehicle v, ArrayList<Slot> slots){
        Slot minSlot = new Slot();
        minSlot.setDepth(1000000000);
        minSlot.setWidth(1000000000);

        boolean flag=false;
        //slot dimension must be less than or equal vehicle dimensions
        //and less than the minimum value to get the minimum slot
        for (int i=0;i<slots.size();i++){
            if((slots.get(i)).isAvail()&&v.getDepth()<=(slots.get(i)).getDepth()&&v.getWidth()<=(slots.get(i)).getWidth()
                &&slots.get(i).getWidth()<=minSlot.getWidth()&&slots.get(i).getDepth()<=minSlot.getDepth()){

                minSlot=slots.get(i);
                flag=true;
            }

        }
        if(flag){
            v.setSlotId(minSlot.getId());
            minSlot.setAvail(false);
            v.setSlotId(minSlot.getId());
            return true;
        }
        else {
            return false;
        }

    }

}
