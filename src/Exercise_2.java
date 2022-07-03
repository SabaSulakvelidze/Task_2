import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import Exercise_2.RecordClass;

public class Exercise_2 {

    public static void main(String[] args) {

        BlockingQueue<RecordClass> queue = new ArrayBlockingQueue<>(3);
        queue.add(new RecordClass("Shota"));
        queue.add(new RecordClass("Ilia"));
        queue.add(new RecordClass("Akaki"));

        System.out.println("People in line: ");
        printQueueList(queue);

        try {
            queue.add(new RecordClass("Vazha"));
        }catch (Exception e){
            System.out.println("Exception caught");
            int oldQueueSize = queue.size();
            BlockingQueue<RecordClass> newQueue = new ArrayBlockingQueue<>(2*oldQueueSize);
            newQueue.addAll(queue);
            newQueue.add(new RecordClass("Vazha"));
            printQueueList(newQueue);
        }

    }

    public static void printQueueList(BlockingQueue<RecordClass> queue){
        for (RecordClass s : queue)
            System.out.println(s.name());
    }
}
