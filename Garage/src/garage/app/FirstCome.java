package garage.app;

import java.util.ArrayList;

public class FirstCome implements Configuration{
    public boolean parkMethod(Vehicle v, ArrayList<Slot> slots){
            boolean flag=false;
            Slot first = new Slot();
            for (int i=0;i< slots.size();i++){
                if((slots.get(i)).isAvail()&&v.getDepth()<=(slots.get(i)).getDepth()&&v.getWidth()<=(slots.get(i)).getWidth()){
                    flag=true;
                    first=slots.get(i);
                    break;
                }
            }
            if(flag){
                v.setSlotId(first.getId());
                first.setAvail(false);
                v.setSlotId(first.getId());
                return true;
            }
            else {
                return false;
            }

    }

}
