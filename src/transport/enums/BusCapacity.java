package transport.enums;

public enum BusCapacity {
    VERY_SMALL ("особо малая (до 10 мест)", null , 10),
    SMALL ("малая (до 25)", 10, 25),
    MIDDLE ("средняя (40–50)", 40, 50),
    BIG ("большая (60–80)", 60, 80),
    VERY_BIG ("особо большая (100–120 мест)", 100, 120);

    private String title;
    private Integer top;
    private Integer bottom;

    BusCapacity(String title, Integer top, Integer bottom) {
        this.title = title;
        this.top = top;
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        return "Вместимость:" +
                (top != null?top + " - " : "") +
                (bottom != null?bottom :"") + " мест";
    }
}
