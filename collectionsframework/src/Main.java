import java.util.*;

public class Main {

    public static void main(String[] args) {
        /**
         * This extends Collection and an instance of List stores an ordered collection of elements.
         */

        /***
         * LinkedList implements Deque interface as well, so it provides queue like FIFO
         * functionality through methods such as peek() and poll()
         * As seen in performance comparison, ArrayList is better
         * for storing and accessing data. LinkedList is better for manipulating data.
         */

        // Array List

        ArrayList a1 = new ArrayList();
        a1.add("Zara");
        a1.add("Mahnaz");
        a1.add("Ayan");
        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);

        // LinkedList
        LinkedList l1 = new LinkedList();
        l1.add("Zara");
        l1.add("Mahnaz");
        l1.add("Ayan");
        System.out.println();
        System.out.println(" LinkedList Elements");
        System.out.print("\t" + l1);


        /***
         * SET
         * This extends Collection to handle sets, which must contain unique elements.
         */

        Set s1 = new HashSet();
        s1.add("Zara");
        s1.add("Mahnaz");
        s1.add("Ayan");
        s1.add("Ayan");
        System.out.println();
        System.out.println(" Set Elements");
        System.out.print("\t" + s1);


        // HashMap
        Map m1 = new HashMap();
        m1.put("Zara", "8");
        m1.put("Mahnaz", "31");
        m1.put("Ayan", "12");
        m1.put("Daisy", "14");
        System.out.println();
        System.out.println(" Map Elements");
        System.out.print("\t" + m1);

        /**
         * The Enumeration Interfac
         * Arrays in Java are enough to store basic t
         * ypes of data, and objects of a certain class whose number we know in
         * advance. Sometimes we want to store objects in a matrix but we do not know
         * how many objects we are going to save.
         */
        Vector dayNames = new Vector();
        dayNames.add("Sunday");
        dayNames.add("Monday");
        dayNames.add("Tuesday");
        dayNames.add("Wednesday");
        dayNames.add("Thursday");
        dayNames.add("Friday");
        dayNames.add("Saturday");
        Enumeration days = dayNames.elements();

        while (days.hasMoreElements()) {
            System.out.println(days.nextElement());
        }
    }
}
