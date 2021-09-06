public class Move {
    public Sides side;
    public MoveType type;

    public Move(String move) {
        if (move.length() == 2) {
            if (move.charAt(1) == '2') {
                type = MoveType.DOUBLE;
            }
            else {
                type = MoveType.REVERSE;
            }
        }
        else {
            type = MoveType.CLOCK;
        }

        switch (move.charAt(0)) {
            case 'F':
                side = Sides.FRONT;
                break;
            case 'U':
                side = Sides.UP;
                break;
            case 'D':
                side = Sides.DOWN;
                break;
            case 'B':
                side = Sides.BACK;
                break;
            case 'L':
                side = Sides.LEFT;
                break;
            case 'R':
                side = Sides.RIGHT;
                break;
        }
    }
}
