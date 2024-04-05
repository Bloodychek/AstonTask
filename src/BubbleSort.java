public class BubbleSort {

    public static void sortByAge(SomeArrayList<Integer> integerSomeArrayList) {
        boolean sorted = false;
        int temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < integerSomeArrayList.getSize() - 1; i++) {
                if (integerSomeArrayList.get(i).compareTo(integerSomeArrayList.get(i + 1)) > 0) {
                    temp = integerSomeArrayList.get(i);
                    integerSomeArrayList.set(i, integerSomeArrayList.get(i + 1));
                    integerSomeArrayList.set(i + 1, temp);
                    sorted = false;
                }
            }
        }
    }
}