public class Main {
    public static void main(String[] args) {
        Hero h1 = new Warrior();
        Hero h2 = new Ninja();
        Hero h3 = new Rogue();
        BadLuck bl = new StormFire();
        bl.execute(h1);
        bl.execute(h2);
        bl.execute(h3);
    }
}