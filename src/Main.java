import transport.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static transport.enums.BodyType.*;
import static transport.enums.BusCapacity.*;
import static transport.enums.LiftCapacity.*;
import static transport.enums.TranportTypes.*;

public class Main {
    private static Car[] auto;
    private static Truck[] trucks;
    private static Bus[] buses;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите логин:");
        String l = br.readLine();

        System.out.println("Введите пароль:");
        String p = br.readLine();

        System.out.println("Подтвердите пароль:");
        String cp = br.readLine();

        EnterPassword en = new EnterPassword(l, p, cp);
        en.check();

        System.out.println("Домашнее задание 20.");
        System.out.println();
        car();
        truck();
        buses();
        Car currentCar = auto[0];
        Bus currentBus = buses[0];
        Truck currentTruck = trucks[1];
        Driver driver1 = new Driver("Ivan", 5.0, B);
        infoAuto(currentCar, driver1);
        Driver driver2 = new Driver("Stepan", 6.0, D);
        infoAuto(currentTruck, driver2);
        Driver driver3 = new Driver("Fedor", -6.0, null);
        infoAuto(currentBus, driver3);
    }

    public static <T extends Transport> void infoAuto(T auto, Driver driver) {
        System.out.println(driver);
        System.out.println(auto);
        if (driver.startMoving(auto.getType())) {
            System.out.println(String.format("водитель %s участвует в гонках", driver.getName()));
            auto.startMoving();
            auto.pitStop();
            auto.bestTime();
            auto.maxSpeed();
            driver.stopMoving();
            driver.refuelCar();
            auto.finishMoving();
        } else {
            System.out.println(String.format("водитель %s не может управлять транспортным средством типа %s", driver.getName(), auto.getType()));
        }
        System.out.println();
    }

    public static void car() {
        auto = new Car[5];
        auto[0] = new Car("Lada", "Granta", -1.7, PICKUP,true);
        auto[1] = new Car("Audi", "A8 50 L TDI quattro", 3.0, SEDAN,true);
//        auto[2] = new transport.Car("BMW", "Z8", 3, "чёрный", "Германия");
        auto[3] = new Car("Kia", "Sportage 4-го поколения", 2.4, SUV,false);
        auto[4] = new Car("Hyundai", "Avante", -1.6, VAN,true);
        printInfoAuto(auto);
        //infoCar();
        System.out.println();
    }

    public static <T> void printInfoAuto(T[] auto) {
        for (T a: auto) {
            if (a != null) {
                System.out.println(a);
            }
        }
    }

    public static void infoCar() {
//        for (int i = 0; i < auto.length; i++) {
//            if (auto[i] != null)
//        System.out.println(auto[i]);
//        или так
        for (Car auto : auto) {
            if (auto != null) {
                System.out.println(auto);
            }
        }
    }

    public static void truck() {
        trucks = new Truck[2];
        trucks[0] = new Truck("Камаз", "", 11.0, N1,true);
        trucks[1] = new Truck("МАЗ", "В-901", 11.0, N2,false);
        infoTruck();
        System.out.println();
    }

    public static void infoTruck() {
        for (Truck truck : trucks) {
            if (truck != null) {
                System.out.println(truck);
            }
        }
    }

    public static void buses() {
        buses = new Bus[2];
        buses[0] = new Bus("Ласточка", "В-901", 31.0, BIG, null);
        buses[1] = new Bus("Ленинград", /*"В-901"*/"", 31.0, SMALL, null);
        infoBus();
        System.out.println();
    }

    public static void infoBus() {
        for (Bus buses : buses) {
            if (buses != null) {
                System.out.println(buses);
            }
        }
    }
}