package src;

public class CalatoriB extends Vagon {

    public CalatoriB() { this(50,400); }

    public CalatoriB(int passenger, int delivery) {
        super(passenger,delivery);
    }

    public void openDoors() {
        System.out.println("Opening CalatoriB doors!");
    }
    public void closeDoors() {
        System.out.println("Closing CalatoriB doors!");
    }
    public void lockWindows() {
        System.out.println("Locking windows!");
    }
}
