package Week1_Transportation;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus(1);
        Bus bus1 = new Bus(2);

        bus.take(2);
        bus.showState();
        bus.chaneOilGage(-50);
        bus.State();
        bus.take(4);
        bus.chaneOilGage(10);
        bus.State();
        bus.take(45);
        bus.take(5);
        bus.showState();
        bus.chaneOilGage(-55);
    }
}
