package transport;

import transport.enums.BodyType;
import valid.ValidateUtils;

import java.time.LocalDate;

import static transport.enums.TranportTypes.B;
import static valid.ValidateUtils.*;

public class Car extends Transport {
    private BodyType bodyType;
    @Override
    public void startMoving() {
        System.out.println("начало движения");
    }

    @Override
    public void finishMoving() {
        System.out.println("конец движения");
    }

    public Car(String brand, String model, Double engineVolume, BodyType bodyType, Boolean checkDiagnostic) {
        super(brand, model, engineVolume, B, checkDiagnostic);
        //this.setType("B");
        this.setBodyType(bodyType);
//        this.brand = validateString(brand, DEFAULT_MESSAGE);
//        this.model = validateParameter(model);
//        this.engineVolume = validateEngineVolume(engineVolume);
//        this.color = validateColor(color);
//        this.year = validateYear(year);
//        this.country = validateParameter(country);
//        this.transmission = validateString(transmission, DEFAULT_MESSAGE);
//        this.body = validateParameter(body);
//        this.registrationNumber = registrationNumber;
//        this.numberPlaces = validateYearAndNumber(numberPlaces).intValue();
//        this.tyre = validateTyre(validateString(tyre, DEFAULT_MESSAGE));
//        this.key = new Key(remoteStartEngine, keylessAccess);
//        this.insurance = new Insurance(timeAction, cost, number);
    }

    @Override
    public String toString() {
        return "Легковое авто - марка: " + getBrand() + ", модель: " + getModel() + ", объем двигателя: " +
                getEngineVolume() + ", "+ getBodyType().toString() + ", класс транспортного средства: " + getType();
    }

    @Override
    public void pitStop() {
        System.out.println("пит стоп легкового автомобиля");
    }

    @Override
    public void bestTime() {
        System.out.println("лучшее время легкового автомобиля");
    }

    @Override
    public void maxSpeed() {
        System.out.println("максимальная скорость легкового автомобиля");
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void diagnostics() {
        System.out.println("легковые автомобили могут проходить диагностику");
        if (this.getCheckDiagnostic() != null && this.getCheckDiagnostic()) {
            System.out.println("Диагностика автомобиля пройдена");
        } else {
            System.out.println("Диагностика автомобиля не пройдена");
        }
    }
}