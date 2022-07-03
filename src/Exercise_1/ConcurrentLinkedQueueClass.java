package Exercise_1;

import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueClass implements Runnable{

    @Override
    public void run() {
        performQueueOperations();
    }

    static void createBBQLine(ConcurrentLinkedQueue<String> bbqLine){
        bbqLine.add("Shota");
        bbqLine.add("Ilia");
        bbqLine.add("Akaki");
    }

    static void serveFoodToFirstInLine(ConcurrentLinkedQueue<String> bbqLine){
        System.out.println(bbqLine.poll()+ " is served");
    }

    static void seeWhoIsNextInLine(ConcurrentLinkedQueue<String> bbqLine){
        System.out.println("Next in line: "+bbqLine.peek());
    }

    static void seeWhoIsInLine(ConcurrentLinkedQueue<String> bbqLine){
        System.out.println("People in line: "+bbqLine);
    }

    public static void performQueueOperations(){
        System.out.println("\n");
        ConcurrentLinkedQueue<String> line = new ConcurrentLinkedQueue<>();

        createBBQLine(line);
        seeWhoIsInLine(line);
        serveFoodToFirstInLine(line);
        seeWhoIsNextInLine(line);
    }
}
