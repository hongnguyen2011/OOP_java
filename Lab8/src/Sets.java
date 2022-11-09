import java.util.*;
public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> set = new HashSet<>();
        for(Integer i : first){
            if(second.contains(i)){
                second.add(i);
            }
        }

        return  set ;
    }
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> set = new HashSet<>(first);
        for(Integer i : second ){
            if(!first.contains(i)){
                set.add(i);
            }
        }
        return set ;
    }
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> set = new HashSet<>(first);
        set.addAll(second);
        return set ;
    }
    public static Set<Integer>  intersection(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
        return first ;
    }
    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));
    }
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> list = new ArrayList<>();
        for(Integer i : source ){
            if(!source.contains(i)){
                list.add(i);
            }
        }
        return list ;
    }
    public static String firstRecurringCharacter(String s) {
        Set<Character> characters = new HashSet<>();
        char[] chars = s.toCharArray();
        for (Character i : chars){
            if(!characters.contains(i)) {
                characters.add(i);
            } else {
                return "" + i ;
            }
        }
        return null ;
    }

    public static Set<Character> allRecurringCharacter(String s) {
        Set<Character> setChar1 = new HashSet<>();
        Set<Character> setChar2 = new HashSet<>();
        char[] s1 = s.toCharArray();
        for(Character i : s1) {
            if (!setChar1.contains(i)) {
                setChar1.add(i);
            } else {
                setChar2.add(i);
            }
        }
        return setChar2;
    }

    public static Integer[] toArray(Set<Integer> source) {
        Integer[] temp = new Integer[source.size()];
        int i = 0 ;
        for(Integer n : source){
            temp[i]=n ;
            i++;
        }
        return  temp ;
    }
    public static int getFirst(TreeSet<Integer> source) {
        return source.first() ;
    }
    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }
    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.ceiling(value);
    }
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i+2);
            list1.add(i+3);
            list2.add(i+5);
            list2.add(i+7);
        }
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        // Manual method
        System.out.println("Manual ");
        System.out.println("Intersection: " + intersectionManual(set1, set2));
        System.out.println("Union: " + unionManual(set1, set2));
        System.out.println("Remove Duplicates from list1: " + removeDuplicatesManual(list1));

        // Unsing Api
        System.out.println("Intersection: " + intersection(set1, set2));
        System.out.println("Union: " + union(set1, set2));
        System.out.println("Set1 to list: " + toList(set1));
        System.out.println("Remove Duplicates from list 2: " + removeDuplicates(list2));

        // Recurrsing Character
        System.out.println("First Recurrsing Char of \"abcsca\"" + firstRecurringCharacter("abcsca"));
        System.out.println("All Recurrsing Char of \"abcsca\"" + allRecurringCharacter("abcsca"));

        //ToArray
        Integer[] anArray = toArray(set1);
        System.out.println("Set1 to array: " + anArray[0]);
        for (int i = 1; i < anArray.length; i++) {
            System.out.print(anArray[i] + " ");
        }
        System.out.println();
        //TreeSet
        TreeSet<Integer> treeSet1 = new TreeSet<>(set1);
        System.out.println("TreeSet: " + treeSet1);
        System.out.println("getFirst: " + getFirst(treeSet1));
        System.out.println("getLas: " + getLast(treeSet1));
        System.out.println("getGreater: " + getGreater(treeSet1, 8));
    }
}