package Exercise_0;

import java.util.*;

public class QueueNStuff {

    static void createBBQLine(Queue<String> bbqLine){
        bbqLine.add("Shota");
        bbqLine.add("Ilia");
        bbqLine.add("Akaki");
    }

    static void serveFoodToFirstInLine(Queue<String> bbqLine){
        System.out.println(bbqLine.poll()+ " is served");
    }

    static void seeWhoIsNextInLine(Queue<String> bbqLine){
        System.out.println("Next in line: "+bbqLine.peek());
    }

    static void seeWhoIsInLine(Queue<String> bbqLine){
        System.out.println("People in line: "+bbqLine);
    }

    public static void performQueueOperations(){
        Queue<String> line = new LinkedList<>();

        createBBQLine(line);
        seeWhoIsInLine(line);
        serveFoodToFirstInLine(line);
        seeWhoIsNextInLine(line);
    }
}
