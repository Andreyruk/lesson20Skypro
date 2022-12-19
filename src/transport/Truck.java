package transport;

import transport.enums.LiftCapacity;

import static transport.enums.TranportTypes.C;

public class Truck extends Transport {
    private LiftCapacity liftCapacity;
    @Override
    public void startMoving() {
        System.out.println("начало движения");
    }

    @Override
    public void finishMoving() {
        System.out.println("конец движения");
    }

    //    private Double priceTrip;
//    private Double timeTrip;
//    private String stationDepartures;
//    private String stationArrival;
//    private Integer quantityVan;
    public Truck(String brand, String model, Double engineVolume, LiftCapacity liftCapacity, Boolean checkDiagnostic) {
        super(brand, model, engineVolume, C, checkDiagnostic);
       // this.setType("C");
        this.setLiftCapacity(liftCapacity);
//        this.priceTrip = validateYearAndNumber(priceTrip).doubleValue();
//        this.timeTrip = validateYearAndNumber(timeTrip).doubleValue();
//        this.stationDepartures = validateString(stationDepartures, DEFAULT_MESSAGE);
//        this.stationArrival = validateString(stationArrival, DEFAULT_MESSAGE);
//        this.quantityVan = validateYearAndNumber(quantityVan).intValue();
    }

    @Override
    public String toString() {
        return "Грузовое авто - марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " +
                getEngineVolume() + ", " + liftCapacity.toString() + ", класс транспортного средства: " + getType()/* + ", " +
                "priceTrip=" + priceTrip +
                ", timeTrip=" + timeTrip +
                ", stationDepartures='" + stationDepartures + '\'' +
                ", stationArrival='" + stationArrival + '\'' +
                ", quantityVan=" + quantityVan + ", " + getMaxSpeed() + ", " + getFuelType() +
                '}'*/;
    }

    @Override
    public void pitStop() {
        System.out.println("пит стоп грузового автомобиля");
    }

    @Override
    public void bestTime() {
        System.out.println("лучшее время грузового автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость грузового автомобиля");
    }

    public LiftCapacity getLiftCapacity() {
        return liftCapacity;
    }

    public void setLiftCapacity(LiftCapacity liftCapacity) {
        this.liftCapacity = liftCapacity;
    }

    @Override
    public void diagnostics() {
        System.out.println("грузовые автомобили могут проходить диагностику");
        if (this.getCheckDiagnostic() != null && this.getCheckDiagnostic()) {
            System.out.println("Диагностика грузового автомобиля пройдена");
        } else {
            System.out.println("Диагностика грузового автомобиля не пройдена");
        }
    }
}
