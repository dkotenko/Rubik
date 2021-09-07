public enum SideColors {
    BLUE(1L),
    WHITE(2L),
    RED(3L),
    GREEN(4L),
    YELLOW(5L),
    ORANGE(6L);


    private long value;

    private SideColors(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

}
