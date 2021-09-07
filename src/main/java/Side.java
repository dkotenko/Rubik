public class Side {
    public SideType side;
    public SideType left;
    public SideType right;
    public SideType up;
    public SideType down;

    public Side(SideType side) {
        this.side = side;

        switch (side) {
            case FRONT:
                left = SideType.LEFT;
                right = SideType.RIGHT;
                up = SideType.UP;
                down = SideType.DOWN;
                break;
            case LEFT:
                left = SideType.BACK;
                right = SideType.FRONT;
                up = SideType.UP;
                down = SideType.DOWN;
                break;
            case RIGHT:
                left = SideType.FRONT;
                right = SideType.BACK;
                up = SideType.UP;
                down = SideType.DOWN;
                break;
            case BACK:
                left = SideType.RIGHT;
                right = SideType.LEFT;
                up = SideType.UP;
                down = SideType.DOWN;
                break;
            case UP:
                left = SideType.LEFT;
                right = SideType.RIGHT;
                up = SideType.BACK;
                down = SideType.FRONT;
                break;
            case DOWN:
                left = SideType.LEFT;
                right = SideType.RIGHT;
                up = SideType.FRONT;
                down = SideType.BACK;
                break;
        }
    }
}
