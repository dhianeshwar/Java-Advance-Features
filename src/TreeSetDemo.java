import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<String> ts=new TreeSet<>();
        ts.add("z");
        ts.add("bcd");
        ts.add("abed");
        ts.add("array");
        System.out.println("Ascending order: "+ts);
        Set<String> tsd= new TreeSet<>(Comparator.reverseOrder());
        tsd.addAll(ts);
        System.out.println("Descending order: "+tsd);
    }
}
