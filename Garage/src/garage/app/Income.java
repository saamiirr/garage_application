package garage.app;

public class Income {

    private static int total;

    public int calcFees(Vehicle vehicle){
        String aTime=vehicle.getArrivalTime();
        String dTime=vehicle.getDepartureTime();

        // get the arrival time in integer
        double aHour=aTime.charAt(0)-48;
        aHour*=10;
        aHour+=(aTime.charAt(1)-48);

        // get the arrival minute in integer
        double aMinute=aTime.charAt(3)-48;
        aMinute*=10;
        aMinute+=(aTime.charAt(4)-48);
        // minute into hours
        aMinute/=60;
        aHour+=aMinute;


        // get the departure time in integer
        double dHour=dTime.charAt(0)-48;
        dHour*=10;
        dHour+=(dTime.charAt(1)-48);

        // get the departure minute in integer
        double dMinute=dTime.charAt(3)-48;
        dMinute*=10;
        dMinute+=(dTime.charAt(4)-48);

        // minute into hours
        dMinute/=60;
        dHour+=dMinute;
        double ans=dHour-aHour;
        ans=Math.ceil(ans);
        int temp=(int)ans;
        temp*=5;


        // the fees = departure time - arrival time * 5 (dH-aH *5)

        //increase total income
        total+=temp;

        return (temp);
    }

    public int calcTotal() {
        return total;
    }
}
