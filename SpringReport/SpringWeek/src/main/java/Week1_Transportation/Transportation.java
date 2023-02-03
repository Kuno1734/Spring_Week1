package Week1_Transportation;

public abstract class Transportation {
    int number;
    int maxPassenger;
    int passengerCount;
    int money;
    int oilGage;
    int speed;
    String state = "운행중";

    public abstract void take(Integer passenger) ;


    public abstract void showState() ;


    public abstract void chaneOilGage(Integer oilGage);

    public abstract void State();

    public abstract void changeSpeed(int speed);

}