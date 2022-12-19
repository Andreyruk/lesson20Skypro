package exceptions;

public class WrongDriverLicense extends RuntimeException{
    public WrongDriverLicense() {
        super();
    }

    public WrongDriverLicense(String message) {
        super(message);
    }
}
