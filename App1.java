import java.util.*;
public class App {
    
    public static void main(String[] args) throws Exception {

        Queue<String> restaurantreserve = new LinkedList<>();
        restaurantreserve.add("Walt"); 
        restaurantreserve.add("Kaede");  
        restaurantreserve.add("Kiel");  
        restaurantreserve.add("Aleck");   
        restaurantreserve.add("Clemard");  

        System.out.println("The queue is: " + restaurantreserve);
        restaurantreserve.remove();

        System.out.println("The queue is: " + restaurantreserve);
    }
}
