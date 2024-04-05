import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        SomeArrayList<Integer> integerSomeArrayList = new SomeArrayList<>();

        integerSomeArrayList.add(3);
        integerSomeArrayList.add(10);
        integerSomeArrayList.add(654);
        integerSomeArrayList.add(452);
        integerSomeArrayList.add(5);
        integerSomeArrayList.add(612);
        integerSomeArrayList.add(734);
        integerSomeArrayList.add(82);
        integerSomeArrayList.add(10);
        integerSomeArrayList.add(11);
        integerSomeArrayList.add(12);
        integerSomeArrayList.add(13);
        integerSomeArrayList.add(14);


        BubbleSort.sortByAge(integerSomeArrayList);
        integerSomeArrayList.set(integerSomeArrayList.getSize()-1, 100);
        System.out.println(integerSomeArrayList.get(12));
        integerSomeArrayList.remove(11);

        System.out.println(integerSomeArrayList);
    }
}