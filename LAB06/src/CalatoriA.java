package src;

public class CalatoriA extends Vagon{

    public CalatoriA() { this(40,300); }

    public CalatoriA(int passenger, int delivery) {
        super(passenger,delivery);
    }

    public void openDoors() {
        System.out.println("Opening CalatoriA doors!");
    }

    public void closeDoors() {
        System.out.println("Closing CalatoriA doors!");
    }

    public void lockWindows() {}
}

