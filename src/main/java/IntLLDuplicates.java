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

        int starter = 0;
        for (int digits : numbers) {
            System.out.println("DIGITS " + digits);
            System.out.println("STARTER " + starter);
            if (digits != starter) {
                System.out.println(digits);
            } else {
                System.out.println("SKIPWAM");
            }
            System.out.println("___________________");
            starter = digits;
            System.out.println("DIGITS1 " + digits);
            System.out.println("STARTER1 " + starter);

            System.out.println("=====NOV RED=====");
        }
    }
}
