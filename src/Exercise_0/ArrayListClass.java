package Exercise_0;

import java.util.*;

public class ArrayListClass {
    public static void printArrayList(){
        System.out.println("\n ArrayList examples");

        int n = 5;

        ArrayList<Integer> arrayList = new ArrayList<>(n);

        for (int i = 1; i <= n; i++)
            arrayList.add(i);

        System.out.println(arrayList);

        arrayList.remove(3);

        System.out.println(arrayList);

        arrayList.set(0,3);

        arrayList.add(1,9);

        for (Integer integer : arrayList)
            System.out.print(integer + " ");
    }
}

