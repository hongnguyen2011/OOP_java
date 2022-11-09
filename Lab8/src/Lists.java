import java.util.*;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value){
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value){
        if (list != null && list.size() >= 3) {
            list.add(2, value);
        }
    }

    public static void removeThird(ArrayList<Integer> list, int value){
        if (list != null && list.size() >= 3) {
            list.remove(2);
        }
    }

    public static void removeEvil(ArrayList<Integer> list){
        if (list != null ) {
            for (int idx = 0; idx < list.size(); idx++) {
                if (list.get(idx) == 666) {
                    list.remove(idx);
                }
            }
        }
    }

    public static ArrayList<Integer> generateSquare(){
        ArrayList<Integer> list = new ArrayList<>();
        for (int idx = 1; idx <= 10; idx++) {
            list.add(idx * idx);
        }
        return list;
    }

    public static boolean contains(ArrayList<Integer> list, int value){
        for (int idx = 0; idx < list.size(); idx++) {
            if (list.get(idx) == value) {
                return true;
            }
        }
        return false;
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target){
        if (source != null && target.isEmpty()) {
            for (int idx = 0; idx < source.size(); idx++) {
                target.add(source.get(idx));
            }
        }
    }

    public static void reverse(ArrayList<Integer> list){
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list){
        for (int idx1 = 0, idx2 = list.size() - 1; idx1 < idx2; idx1++) {
            int end = list.remove(idx2);
            list.add(idx1, end);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value){
        list.addFirst(value);
        list.addLast(value);
    }

    public static void print(ArrayList<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }

    public static void print1(LinkedList<Integer> list) {
        for (Integer element : list) {
            System.out.print(element + " ");
        }
    }

    public static void main(String[] args) {
//        Create data
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(9);
        list.add(10);
        list.add(128);
        list.add(72);
        print(list);
        System.out.println();
//        Insert First
        System.out.println("Insert First: ");
        insertFirst(list, 40);
        print(list);
        System.out.println();
//      Insert Last
        System.out.println("Insert Last: ");
        insertLast(list, 2819);
        print(list);
        System.out.println();
//      replace all with value
        System.out.println("replace: ");
        replace(list, 12);
        print(list);
        System.out.println();
//      Delete third ele
        System.out.println("Remove THird");
        removeThird(list, 32);
        print(list);
        System.out.println();
//      Delete 666
        System.out.println("Remove Evil");
        removeEvil(list);
        print(list);
        System.out.println();
//      Generate Square
        System.out.println("Generate square");
        print(generateSquare());
        System.out.println();
//      Contain
        System.out.println("Contain");
        System.out.println(contains(list, 10));
        System.out.println();
//      Print Copy
        System.out.println();
        ArrayList<Integer> list1 = new ArrayList<>();
        copy(list, list1);
        print(list1);
        System.out.println();
//      Print reverse using Api
        System.out.println("reverse using API");
        reverse(list);
        print(list);
        System.out.println();
//      Print recerse manual
        System.out.println("reverse manual");
        reverseManual(list1);
        print(list1);
        System.out.println();
//      insert Begin End
        System.out.println("Insert Begin End");
        LinkedList<Integer> list2 = new LinkedList<>();
        insertBeginningEnd(list2, 888);
        print1(list2);
        System.out.println();
    }
}