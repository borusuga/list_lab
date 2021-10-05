import DST.List;

public class Program {
    public static void main(String[] args) {
        List a = new List();
        System.out.println(a.isEmpty());        // true
        a.add(0);                                 // [(obj: 0, ind: 0), ]
        a.add(1, -1);                   // [(obj: 1, ind: 0), (obj: 0, ind: 1),]
        System.out.println(a.contains(1));      // true
        System.out.println(a.contains(2));      // false
        a.add(2, 2);                    // [(obj: 1, ind: 0), (obj: 0, ind: 1), (obj: 2, ind: 2),]
        System.out.println(a.contains(2));      // true
        a.add(20, 1);                   // [(obj: 1, ind: 0), (obj: 20, ind: 1), (obj: 0, ind: 2), (obj: 2, ind: 3),]
        System.out.println(a.contains(20));     // true
        System.out.println(a.get(70));          // null
        System.out.println(a.get(2));           // 0
        System.out.println(a.set(99, 0));         // [(obj: 99, ind: 0), (obj: 20, ind: 1), (obj: 0, ind: 2), (obj: 2, ind: 3),] -> 99
        System.out.println(a.remove(0));    // [(obj: 20, ind: 0), (obj: 0, ind: 1), (obj: 2, ind: 2),] -> 99
        System.out.println(a.indexOf(4));       // -1
        System.out.println(a.indexOf(20));      // 0
        System.out.println(a.size());           // 3
        System.out.println(a.remove(0));  // [(obj: 0, ind: 0), (obj: 2, ind: 1),] -> 20
        System.out.println(a.remove(0));  // [(obj: 2, ind: 1),] -> 0
        System.out.println(a.remove(0));  // [] ->  2
        System.out.println(a.remove(0));  // [] -> null
        System.out.println(a.size());           // 0
    }
}
