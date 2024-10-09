import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Amit");
        map.put(5, "Rahul");
        map.put(2, "Jai");
        map.put(6, "Amit");
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while(itr.hasNext()){
            Map.Entry<Integer, String> entry = (Map.Entry<Integer, String>)itr.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
