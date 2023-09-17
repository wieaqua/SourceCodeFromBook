abstract class MotorVehicles {
    abstract void brake();
}

interface MoneyFare {
    void charge();
}

interface ControlTemperature {
    void controlAirTemperature();
}

class Bus extends MotorVehicles implements MoneyFare {
    void brake() {
        System.out.println("公共汽车使用毂式刹车技术");
    }

    public void charge() {
        System.out.println("公共汽车:一元/张，不计算公里数");
    }
}

class Taxi extends MotorVehicles implements MoneyFare, ControlTemperature {
    void brake() {
        System.out.println("出租车使用盘式刹车技术");
    }

    public void charge() {
        System.out.println("出租车:2元/公里, 起价 3 公里");
    }

    public void controlAirTemperature() {
        System.out.println("出租车安装了 Hair 空调");
    }
}

class Cinema implements MoneyFare, ControlTemperature {
    public void charge() {
        System.out.println("电影院:门票,十元/张");
    }

    public void controlAirTemperature() {
        System.out.println("电影院安装了中央空调");
    }
}

public class Example6_3 {
    public static void main(String[] args) {
        Bus bus101 = new Bus();
        Taxi buleTaxi = new Taxi();
        Cinema redStarCinema = new Cinema();
        MoneyFare fare;
        ControlTemperature temperature;
        fare = bus101;
        bus101.brake();
        fare.charge();

        fare = buleTaxi;
        temperature = buleTaxi;
        buleTaxi.brake();
        fare.charge();
        temperature.controlAirTemperature();

        fare = redStarCinema;
        temperature = redStarCinema;
        fare.charge();
        temperature.controlAirTemperature();
    }
}