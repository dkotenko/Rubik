public class Move {
    public SideType side;
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
                side = SideType.FRONT;
                break;
            case 'U':
                side = SideType.UP;
                break;
            case 'D':
                side = SideType.DOWN;
                break;
            case 'B':
                side = SideType.BACK;
                break;
            case 'L':
                side = SideType.LEFT;
                break;
            case 'R':
                side = SideType.RIGHT;
                break;
        }
    }
}
