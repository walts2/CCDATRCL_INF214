import java.util.*;
public class App1 {
    
    public static void main(String[] args) throws Exception {

        Queue<String> restaurantreserve = new LinkedList<>();
        restaurantreserve.add(e: "Walt"); 
        restaurantreserve.add(e: "Kaede");  
        restaurantreserve.add(e: "Kiel");  
        restaurantreserve.add(e: "Aleck");   
        restaurantreserve.add(e: "Clemard");  

        System.out.println("The queue is: " + restaurantreserve);
        restaurantreserve.remove();

        System.out.println("The queue is: " + restaurantreserve);
    }
}
