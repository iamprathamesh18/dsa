import java.util.ArrayList;
import java.util.Set;

public class arraylist_example {
    public static void main(String[] args) {
        ArrayList<Integer> variable = new ArrayList<>(5);
        variable.add(78);
        variable.add(564);
        variable.add(787);

        variable.add(45);
        variable.add(75);
        variable.add(85);
        variable.add(855);
        variable.add(123);
        variable.add(21);

        variable.set(0,66);

        variable.remove(0);

        System.out.println(variable);
        System.out.println(variable.contains(619));



    }
}
