public enum Sides {
    FRONT(0),
    BACK(1),
    LEFT(2),
    RIGHT(3),
    UP(4),
    DOWN(5);

    private final int value;

    private Sides(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}