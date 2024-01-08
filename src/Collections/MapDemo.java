package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, Students> map = new HashMap<>();
        map.put(1, new Students("dhianesh", 22));
        map.put(2, new Students("kumar", 12));
        map.put(4, new Students("ravi", 23));
        map.put(5, new Students("raja", 18));

        map.entrySet().forEach(System.out::println);
        map.forEach((key, value) -> System.out.println(key + "_______" + value.name + "-------" + value.age));
        map.entrySet().stream()
                .filter(maps->maps.getValue().age()>20)
                .forEach(x-> System.out.println(x.getValue().name));

//        System.out.println(map.get(7));
    }
    record Students( String name, int age){}
}
