package Task;


import java.util.ArrayList;
import java.util.Optional;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(6);
        list.add(8);

        Optional<Integer> result = list.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .reduce((x, y) -> x + y);

        System.out.println(result);
    }
}
