package transport.enums;

public enum LiftCapacity {

    N1("с полной массой до 3,5 тонн", null, 3.5),
    N2("с полной массой свыше 3,5 до 12 тонн", 3.5, 12.0),
    N3("с полной массой свыше 12 тонн", 12.0, null);

    private String title;
    private Double top;
    private Double bottom;

    LiftCapacity(String title, Double top, Double bottom) {
        this.title = title;
        this.top = top;
        this.bottom = bottom;
    }

    public String getTitle() {
        return title;
    }

    public Double getTop() {
        return top;
    }

    public Double getBottom() {
        return bottom;
    }

    @Override
    public String toString() {
        return "Грузоподъемность:" +
                (top != null?" от " + top + " тонн " : "") +
                (bottom != null?" до " + bottom + " тонн ":"");
    }
}
