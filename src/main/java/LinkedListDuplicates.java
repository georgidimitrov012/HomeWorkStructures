import java.util.LinkedList;

public class LinkedListDuplicates {
    public static void main(String[] args) {
        LinkedList<String> bikes = new LinkedList<String>();
        bikes.add("Honda");
        bikes.add("Kawasaki");
        bikes.add("BMW");
        bikes.add("Indian");
        bikes.add("Honda");
        bikes.add("Indian");
        System.out.println(bikes);

        for (String motorcycles : bikes){
            String currentBike = motorcycles;
            //System.out.println(currentBike.equals(bikes));
            if (currentBike.equals(bikes) ) {
                //System.out.println(currentBike);
            }
        }
    }
}