package garage.app;

public class Method {
    private static int config;

    public void setConfig(int config) {
        Method.config = config;
    }

    public Configuration getCurrent(){
        if(config==1)
            return new FirstCome();
        else
            return new BestFit();

    }



}
