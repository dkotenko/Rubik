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

    public static SideColors getSideByValue(int value) {
        for (int i = 0; i < SideColors.values().length; i++) {
            if (SideColors.values()[i].getValue() == value) {
                return SideColors.values()[i];
            }
        }
        return null;
    }
}
