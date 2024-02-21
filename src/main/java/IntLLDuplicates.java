import java.util.LinkedList;

public class IntLLDuplicates {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(2);

        LinkedList<Integer> newList = new LinkedList<Integer>();
        for (int newNumbers : numbers) {
            if (newList.contains(newNumbers)) {
                System.out.println("Вече имаме числото: " + newNumbers);
            } else {
                newList.add(newNumbers);
            }
        }
        System.out.println(newList);

    }
}
