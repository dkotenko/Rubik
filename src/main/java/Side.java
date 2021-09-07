import jdk.nashorn.internal.ir.CaseNode;

public class Side {
    public Sides side;
    public Sides left;
    public Sides right;
    public Sides up;
    public Sides down;

    public Side(Sides side) {
        this.side = side;

        switch (side) {
            case FRONT:
                left = Sides.LEFT;
                right = Sides.RIGHT;
                up = Sides.UP;
                down = Sides.DOWN;
                break;
            case LEFT:
                left = Sides.BACK;
                right = Sides.FRONT;
                up = Sides.UP;
                down = Sides.DOWN;
                break;
            case RIGHT:
                left = Sides.FRONT;
                right = Sides.BACK;
                up = Sides.UP;
                down = Sides.DOWN;
                break;
            case BACK:
                left = Sides.RIGHT;
                right = Sides.LEFT;
                up = Sides.UP;
                down = Sides.DOWN;
                break;
            case UP:
                left = Sides.LEFT;
                right = Sides.RIGHT;
                up = Sides.BACK;
                down = Sides.FRONT;
                break;
            case DOWN:
                left = Sides.LEFT;
                right = Sides.RIGHT;
                up = Sides.FRONT;
                down = Sides.BACK;
                break;
        }
    }
}
