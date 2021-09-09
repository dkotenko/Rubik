import java.util.HashMap;
import java.util.LinkedList;

public class Cube {
    public int [] cube;
    private static final int maskTwoLast = 0x000000ff;
    private static final int maskTwoFirst = 0xff000000;
    private static final int maskFourLast = 0x0000ffff;
    private static final int maskFourFirst = 0xffff0000;
    private static final int maskLeftStripe = 0xf00000ff;
    private static final int maskRightStripe = 0x00fff000;
    private static final int maskTopStripe = 0xfff00000;
    private static final int maskBottomStripe = 0x0000fff0;

    //sides order: F-B-L-R-U-D

    private Side [] sides;

    public Cube(LinkedList<String> moves)
    {
        initCube();
        cube = new int[6];
        for (int i = 0; i < 6; i++) {
            initSide();
        }
        moves.forEach(x -> doMove(new Move(x)));
    }

    private void setCell() {

    }

    private void initSide() {

    }

    private void initCube() {
        ;
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

    private void turnClockwise(Sides side) {
        int newLeft = cube[side.getValue()] & maskTwoLast;
        cube[side.getValue()] = newLeft << 6 * 4 + cube[side.getValue()] >> 2 * 4;
        int temp = cube[sides[side.getValue()].left.getValue()] & 0xf;
    }

    private void turnCounterClockwise(Sides side) {

    }

    private void turnDoubleClockwise(Sides side) {

    }

    int getCell(Sides side, int cellNumber) {
        return cube[side.getValue()] &= maskTwoFirst >> (4 * (cellNumber - 1));
    }

    public void print() {
        //U
        for (int i = 0; i < 6; i++) {
            printInt(cube[i], 1, 1);
            System.out.println(cube[i]);
        }
    }

    public static void printInt(int side, int sideSize, int offset) {
        for (int bit = 1; bit < 9; bit++) {
            int temp = side << bit - 1;
            temp = temp >> 8 - bit;
            for (int i = 0; i < offset * sideSize; i++) {
                System.out.print(" ");
            }

            SideColors currSide = SideColors.getSideByValue(temp);
            for (int i = 0; i < sideSize; i++) {
                System.out.print(currSide.name().charAt(0));
            }
            System.out.println();
        }
    }


}
