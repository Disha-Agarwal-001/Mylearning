import java.util.ArrayList;
import java.util.Collections;

public class ArrLstSort {
    public static void main(String rags[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(8);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(1);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        //descending
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }
}