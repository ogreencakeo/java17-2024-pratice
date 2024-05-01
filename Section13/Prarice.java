package Section13;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Prarice {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();
        queue.add("홍길동");
        queue.add("이순신");
        queue.add("강감찬");

        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue);

        queue.remove("이순신");
        System.out.println(queue);

        queue.clear();

        queue.add("광개토 대왕");
        queue.add("장수왕");
        queue.add("세종대왕");

        for(String s : queue){
            System.out.println(s);
        }

        System.out.println(queue.element());

        queue.offer("정조");
        System.out.println(queue);
        System.out.println(queue.peek());
        System.out.println(queue.element());

        queue.offerFirst("영조");
        System.out.println(queue.peek());
        System.out.println(queue.element());

        queue.add(2, "선조");

        System.out.println(queue);
    }
}

    