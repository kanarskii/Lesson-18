package Task;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class TaskStar {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Dima");
        map.put(2, "Vladimer");
        map.put(3, "Maksim");
        map.put(4, "Dima");
        map.put(5, "Bob");
        map.put(6, "Tom");
        map.put(7, "Andrey");

        List<String> list = map.entrySet().stream()
                .filter(x -> x.getKey() == 1 || x.getKey() == 2 || x.getKey() == 5 || x.getKey() == 8 || x.getKey() == 9 || x.getKey() == 13)
                .filter(x -> x.getValue().length() % 2 != 0)
                .map(x -> {
                    StringBuilder name = new StringBuilder(x.getValue());
                    return name.reverse().toString();
                })
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
