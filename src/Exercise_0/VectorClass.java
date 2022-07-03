package Exercise_0;

import java.util.*;

public class VectorClass implements Runnable{

    public static void printVector(){
        System.out.println("");
        System.out.println("VectorList examples");

        int n = 5;

        Vector<Integer> vectorList = new Vector<>(n);

        for (int i = 1; i <= n; i++)
            vectorList.add(i);

        System.out.println(vectorList);

        vectorList.remove(3);

        System.out.println(vectorList);

        vectorList.set(0,3);

        vectorList.add(1,9);

        for (Integer integer : vectorList)
            System.out.print(integer + " ");

        System.out.println("\n");
    }

    @Override
    public void run() {
        printVector();
    }
}
