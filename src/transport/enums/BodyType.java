package transport.enums;

public enum BodyType {
    SEDAN ("Седан"),
    HATCHBACK ("Хэтчбек"),
    COUPE ("Купе"),
    WAGON ("Универсал"),
    SUV ("Внедорожник"),
    CROSSOVER ("Кроссовер"),
    PICKUP ("Пикап"),
    VAN ("Фургон"),
    MINIVAN ("Минивэн");

    private String title;

    BodyType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Тип кузова: " +
                title;
    }
}
