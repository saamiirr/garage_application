package garage.app;

public class Slot {
    private int width;
    private int depth;
    private boolean avail;
    private int id; //id for each slot
    private static int id_=0; //id for all slots

    public Slot() {
        id=++id_;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDepth() {
        return depth;
    }

    public void setDepth(int depth) {
        this.depth = depth;
    }

    public boolean isAvail() {
        return avail;
    }

    public void setAvail(boolean avail) {
        this.avail = avail;
    }

    public int getId() {
        return id;
    }
}