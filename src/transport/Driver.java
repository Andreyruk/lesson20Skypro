package transport;

import exceptions.WrongDriverLicense;
import transport.enums.TranportTypes;

import static transport.Transport.DEFAULT_MESSAGE;
import static valid.ValidateUtils.*;

public class Driver {
    private String name;
    private Number experience;
    //private Class<T> typeDriverLicense;
    private TranportTypes tranportType;

    public boolean startMoving(TranportTypes tranportType) {
        if (this.tranportType == null) {
            throw new WrongDriverLicense("у водителя не указан тип прав");
        }
        if (tranportType == this.tranportType) {
            return true;
        } else {
            System.out.println("у водителя не указана неверная категория");
            //throw new WrongDriverLicense("у водителя не указана неверная категория");
        }
        return false;
    }

    public void stopMoving() {
        System.out.println("водитель остановил транспортное средство");
    }

    public void refuelCar() {
        System.out.println("водитель заправил транспортное средство");
    }

    public Driver(String name, Double experience, TranportTypes tranportType) {
        this.name = validateString(name, DEFAULT_MESSAGE);
        this.experience = validateMathNumber(experience);
        this.tranportType = tranportType;
    }

    public String getName() {
        return name;
    }

    public Number getExperience() {
        return experience;
    }

//    public Class<T> getTypeDriverLicense() {
//        return typeDriverLicense;
//    }


    public TranportTypes getTranportType() {
        return tranportType;
    }

    @Override
    public String toString() {
        return "Водитель " + name +
                ", стаж " + experience +
                ", водительские права категории " + tranportType;
    }
}
