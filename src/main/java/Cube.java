import java.util.LinkedList;

public class Cube {

    private static final int maskTwoLast = 0x000000ff;
    private static final int maskTwoFirst = 0xff000000;
    private static final int maskFourLast = 0x0000ffff;
    private static final int maskFourFirst = 0xffff0000;
    private static final int maskLeftStripe = 0xf00000ff;
    private static final int maskRightStripe = 0x00fff000;
    private static final int maskTopStripe = 0xfff00000;
    private static final int maskBottomStripe = 0x0000fff0;

    public int [] cube;
    private Side [] sides;

    public Cube() {

    }

    public Cube(LinkedList<String> moves)
    {

        //initSolvedCube();
        cube = new int[6];
        for (int i = 0; i < 6; i++) {
            initSide();
        }
        int a = 65536;
        System.out.println(Integer.toBinaryString(a));
        a = setCell(7, 15, a);
        System.out.println(Integer.toBinaryString(a));
        //moves.forEach(x -> doMove(new Move(x)));
    }

    //sides order: F-B-L-R-U-D
    private void initSolvedCube() {
        for (SideType type : SideType.values()) {
            sides[type.getValue()] = new Side(type);
            for (int i = 1; i < 8; i++) {
                cube[type.getValue()] = setCell(i, type.getValue(), cube[type.getValue()]);
            }
        }
    }



    private int setCell(int cellNum, int toSet, int value) {
        //unset bits
        value &= ~(0xF  << (8 - cellNum) * 4);
        //set bits
        value |= 0xF << (8 - cellNum) * 4;
        return value;
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

    private void turnClockwise(SideType side) {
        int newLeft = cube[side.getValue()] & maskTwoLast;
        cube[side.getValue()] = newLeft << 6 * 4 + cube[side.getValue()] >> 2 * 4;
        int temp = cube[sides[side.getValue()].left.getValue()] & 0xf;
    }

    private void turnCounterClockwise(SideType side) {

    }

    private void turnDoubleClockwise(SideType side) {

    }

    int getCell(SideType side, int cellNumber) {
        return cube[side.getValue()] &= maskTwoFirst >> (4 * (cellNumber - 1));
    }

    public void print() {
        //U
        for (int i = 0; i < 6; i++) {
            printInt(cube[i], 1, 1);
            System.out.println(cube[i]);
        }
    }

    public void printInt(int side, int sideSize, int offset) {
        for (int bit = 1; bit < 9; bit++) {
            int temp = side << bit - 1;
            temp = temp >> 8 - bit;
            for (int i = 0; i < offset * sideSize; i++) {
                System.out.print(" ");
            }
            System.out.println(temp);
            SideColors currSide = SideColors.getSideByValue(temp);
            for (int i = 0; i < sideSize; i++) {
                System.out.print(currSide.name().charAt(0));
            }
            System.out.println();
        }
    }


}
