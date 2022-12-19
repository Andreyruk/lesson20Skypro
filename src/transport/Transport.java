package transport;

import transport.enums.TranportTypes;

import static valid.ValidateUtils.*;

public abstract class Transport implements Competitive {
    public final static String DEFAULT_MESSAGE = "default";
    private String brand;
    private String model;
    private Double engineVolume;
    private TranportTypes type;
    private Boolean checkDiagnostic;

    public Transport(String brand, String model, Double engineVolume, TranportTypes type, Boolean checkDiagnostic/*, String country, String color, Double fuelPercentage, Double maxSpeed, String fuelType*/) {
        this.brand = validateString(brand, DEFAULT_MESSAGE);
        this.model = validateString(model, DEFAULT_MESSAGE);
        this.engineVolume = validateEngineVolume(engineVolume);
        this.type = type;//validateString(type, DEFAULT_MESSAGE);
        this.checkDiagnostic = checkDiagnostic;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Double getEngineVolume() {
        return engineVolume;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(Double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public TranportTypes getType() {
        return type;
    }

    public void setType(TranportTypes type) {
        this.type = type;
    }

    public abstract void startMoving();

    public abstract void finishMoving();

    public abstract void diagnostics();

    public Boolean getCheckDiagnostic() {
        return checkDiagnostic;
    }
}