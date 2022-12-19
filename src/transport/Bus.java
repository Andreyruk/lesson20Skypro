package transport;

import transport.enums.BusCapacity;

import static transport.enums.TranportTypes.D;

public class Bus extends Transport {

    private BusCapacity busCapacity;

    //    private final static String DEFAULT_MESSAGE = "default";
    @Override
    public void startMoving() {
        System.out.println("начало движения");
    }

    @Override
    public void finishMoving() {
        System.out.println("конец движения");
    }

    //    private Double priceTrip;
//    private String stationDepartures;
//    private String stationArrival;
    public Bus(String brand, String model, Double engineVolume, BusCapacity busCapacity, Boolean checkDiagnostic) {
        super(brand, model, engineVolume, D, checkDiagnostic);
//        this.setType("D");
        this.setBusCapacity(busCapacity);
//        this.priceTrip = validateYearAndNumber(priceTrip).doubleValue();
//        this.stationDepartures = validateString(stationDepartures, DEFAULT_MESSAGE);
//        this.stationArrival = validateString(stationDepartures, DEFAULT_MESSAGE);
    }

    @Override
    public String toString() {
        return "Автобус - марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " +
                getEngineVolume() + ", " + busCapacity.toString() + ", класс транспортного средства: " + getType();
//                "priceTrip=" + priceTrip +
//                ", stationDepartures='" + stationDepartures + '\'' +
//                ", stationArrival='" + stationArrival + '\'' +
//                '}';
    }

    @Override
    public void pitStop() {
        System.out.println("пит стоп автобуса");
    }

    @Override
    public void bestTime() {
        System.out.println("лучшее время автобуса");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость автобуса");
    }

    public BusCapacity getBusCapacity() {
        return busCapacity;
    }

    public void setBusCapacity(BusCapacity busCapacity) {
        this.busCapacity = busCapacity;
    }

    @Override
    public void diagnostics() {
        System.out.println("автобусы могут не проходить диагностику");
    }
}
