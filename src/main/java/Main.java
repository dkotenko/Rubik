import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        String strMoves = "U R2 F B R B2 R U2 L B2 R U' D' R2 F R' L B2 U2 F2";
        LinkedList<String> moves = new LinkedList<String>(Arrays.asList(strMoves.split(" ")));
        Cube cube = new Cube(moves);
        cube.printInt(1, 3, 1);
    }
}
