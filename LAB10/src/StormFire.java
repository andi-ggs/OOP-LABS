public class StormFire extends BadLuck{

    @Override
    void execute(Hero h) {
        h.print();
        System.out.println("Hero\n");
    }

    @Override
    void execute(Warrior w) {
        w.print();
        System.out.println("Warrior\n");

    }
    @Override
    void execute(Ninja n) {
        n.print();
        System.out.println("Ninja\n");

    }

    @Override
    void execute(Rogue r) {
        r.print();
        System.out.println("Rogue\n");
    }
}
