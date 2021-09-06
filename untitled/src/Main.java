import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String [] args) {
        LinkedList<String> lines = new LinkedList<>();
        lines.add("1,2,3");
        lines.add("4,5,6");

        List<String> list = Arrays.asList("1,2,3","1,1,1","7,6,5");
        List<List<Integer>> nestedList = list.stream()
                .map(e-> Arrays.stream(e.split(","))
                        .map(Integer::new)
                        .collect(Collectors.toList()))
                .collect(Collectors.toList());
        System.out.println(22);
    }
}
