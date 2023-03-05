package src;

public abstract class Vagon {
    private int passenger;

    private int delivery;

    public Vagon() {
        this.passenger = 0;
        this.delivery = 0;
    }

    public Vagon(int passenger, int delivery) {
        this.passenger = passenger;
        this.delivery = delivery;
    }

    public int getDelivery() {
        return this.delivery;
    }

    public void setDelivery(int delivery) {
        this.delivery = delivery;
    }

    public abstract void openDoors();
    public abstract void closeDoors();
    public abstract void lockWindows();
}
