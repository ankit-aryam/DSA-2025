package LinkedList;
import java.util.*;

public class llFramework {
    public static void main(String[] args) {
        LinkedList <String> list = new LinkedList <>();
        list.add("Hello");
        list.add("World");
        System.out.println(list);
        list.addFirst("Nice");
        list.addLast("Hey");
        System.out.println("List -> " + list);
        list.removeFirst();
        System.out.println("Removed First -> " + list);
        list.removeLast();
        System.out.println("Removed Last -> " + list);
        System.out.println(list.size());
        
        
    }
}
