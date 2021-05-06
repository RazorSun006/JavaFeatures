package List;

import java.util.ArrayList;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<List<Integer>> list3 = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);
        list.add(0, 0);
        System.out.println(list);
        List<Integer> list2 = new ArrayList<>();
        list2.add(11);
        list2.add(22);
        list2.add(33);
        list3.add(list);
        list3.add(list2);
        System.out.println(list2.addAll(list));
        System.out.println(list3);
    }
}
