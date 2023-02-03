package Week1_Transportation;

public class Bus extends Transportation {

    public Bus(int number){
        this.number=number;
        System.out.println(number+"번 버스 운행가능");
        maxPassenger = 30;
        passengerCount=0;
        money=0;
        oilGage=100;
        speed=0;
        state ="운행중";
    };

    @Override
    public void take(Integer passenger) {
        if (this.passengerCount + passenger < maxPassenger && state.equals("운행중")) {
            this.passengerCount += passenger;
            money += 1500 * passenger;
        } else if(this.passengerCount + passenger < maxPassenger && state.equals("차고지행")) {
            System.out.println("운행이 불가하여 탑승하실 수 없습니다.");
        }else {
            System.out.println("탑승인원이 초과하여 탑승하실 수 없습니다.");
        }

    }

    @Override
    public void showState() {
        System.out.println("-----------Report--------------");
        System.out.println("현제 탑승객 수 =" + passengerCount);
        System.out.println("잔여 탑승객 수 =" + (maxPassenger - passengerCount));
        System.out.println("현제 요금 =" + money);
        System.out.println("잔여오일 ="+ oilGage);
        System.out.println("현제 운행상태="+state);
        System.out.println("-------------------------------");
    }

    @Override
    public void chaneOilGage(Integer oilGage) {
        this.oilGage += oilGage;
        System.out.println("주유량 =" + this.oilGage);

        if (this.oilGage <= 10) {
            State();
        }
    }

    @Override
    public void State() {
        if (oilGage <= 10) {
            System.out.println("주유가 필요합니다.");
        }
        if (state.equals("운행중")) {
            state = "차고지행";
            System.out.println("치고지행");
        } else {
            state = "운행중";
            System.out.println("운행중");

        }
    }

    @Override
    public void changeSpeed(int speed) {
        if(state.equals("운행중")){
            this.speed += speed;
            System.out.println("현제속도 ="+this.speed);
        } else {
            System.out.println("가속할 수 없는 상태입니다.");
        }

    }
}
