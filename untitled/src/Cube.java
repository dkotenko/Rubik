import java.util.LinkedList;

public class Cube {
    public long [] cube;
    private static final long turnSideMask = 0;
    private static final long turnSideReverseMask = 0;
    private static final long turnSideDoubleMask = 0;

    public Cube(LinkedList<String> moves) {
        moves.forEach(x -> doMove(new Move(x)));
    }

    public void doMove(Move move) {
        switch (move.type) {
            case CLOCK:
                turnClockwise(move.side);
                break;
            case REVERSE:
                turnCounterClockwise(move.side);
                break;
            case DOUBLE:
                turnDoubleClockwise(move.side);
                break;
        }
    }

    //U R2 F B R B2 R U2 L B2 R U' D' R2 F R' L B2 U2 F2.

    private void turnClockwise(Sides side) {

    }

    private void turnCounterClockwise(Sides side) {

    }

    private void turnDoubleClockwise(Sides side) {

    }
}
