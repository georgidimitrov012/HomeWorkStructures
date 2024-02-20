import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(32);
        list.add(12);
        list.add(44);
        list.add(1);
        list.add(54);

        for (int marks : list) {
            System.out.println(marks);
        }

        System.out.println("__________________");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("__________________");
        for (int marks : list){
            System.out.println(marks);
        }
    }

}