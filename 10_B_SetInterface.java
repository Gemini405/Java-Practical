import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main2 {
    public static void main(String[] args) {
        Set <Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(3);
        numbers.add(1);
        System.out.println("Set using TreeSet: " + numbers);
        System.out.println("Accessing elements using iterator(): ");
        Iterator <Integer> iterate = numbers.iterator();
        while (iterate.hasNext()) {
            System.out.print(iterate.next());
            System.out.print(", ");
        } 
    }
}
