public class AvgNegativeNumbers {
    public static void main(String[] args) {
        int[] numbers = {3,5,-1,-3,-4,-2,1,3,8,-2, -3};
        int counter = 0;
        int sumNumbers = 0;
        for (int digits : numbers) {
            if (digits < 0 ){
                System.out.println(digits);
                sumNumbers += digits;

                counter ++;
            }
        }
        System.out.println("The sum of the negative numbers is: " + sumNumbers);
        System.out.println("COUNTER: " + counter);
        double avg = (double) sumNumbers / counter; // Никаква идея нямам защо трябва да го кастна като double втори път ИДЕ-то ми го подсказа!
        System.out.println(avg);
    }
}