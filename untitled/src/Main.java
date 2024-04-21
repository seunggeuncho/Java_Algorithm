import java.sql.Array;
import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ///////////HashMap - put, get, keySet, containsKey,size
        HashMap<String, Integer> temp = new HashMap<String, Integer>();
        temp.put("111",111);
        Integer in = temp.get("111");
        System.out.println("temp.get = " + in);
        for(String t:temp.keySet()) {
            System.out.println(temp.get(t));
        }
        //////////ArrayList - add, get, remove, contains, indexOf
        List<Integer> te = new ArrayList<>();
        te.add(11);
        System.out.println("te.size = " + te.size());
        System.out.println("te.get(0) = " + te.get(0));
        /////////////Que - add, poll, isEmpty

        Queue<Integer> que = new LinkedList<>();
        que.add(123);
        que.add(444);
        System.out.println("que.poll = " + que.poll());

        //////PriorityQueue - add, poll, isEmpty, size
        PriorityQueue<Integer> prio = new PriorityQueue<>();
        prio.add(1123);
        prio.add(444);
        System.out.println("prio.peek() = " + prio.peek());

        System.out.println("prio.poll() = " + prio.poll());
        
        //////////////////
        int[] se = {6,2,5,7,1};
        String ster= "123";
        System.out.println("ster.length() = " + ster.length());
        System.out.println("se.length = " + se.length);
        
        Arrays.sort(se);
        for(int i : se) {
            System.out.println("i = " + i);
        }
        Queue<Integer> ques = new LinkedList<>();
        ques.add(1123);
        ques.add(113);
        ques.add(11);
        System.out.println("ques.peek() = " + ques.peek());
        ques.poll();
        System.out.println("ques.peek() = " + ques.peek());
        
        PriorityQueue<Integer> ew = new PriorityQueue<>();
        
        ew.add(1233);
        ew.add(11);
        ew.add(1);
        System.out.println("ew.peek() = " + ew.peek());
        ArrayList<Integer> we = new ArrayList<>(Arrays.asList(1,2,3));
        int[] rr = we.stream().mapToInt(Integer::intValue).toArray();
        System.out.println(rr);
        
        String tt = "123456";

        System.out.println("tt.substring(1,4) = " + tt.substring(1,4));
        Arrays.sort();
    }
}