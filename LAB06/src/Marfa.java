package src;

public class Marfa extends Vagon {

    public Marfa() { this(0,400); }

    public Marfa(int passenger, int delivery) {
        super(passenger,delivery);
    }

    public void openDoors() {}
    public void closeDoors() {}
    public void lockWindows() {}
}
