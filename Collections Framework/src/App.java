import java.util.Collection;
import java.util.List;
public class App {
    public static void main(String[] args) {

        Room cambridge = new Room("Cambridge", "Premiere Room", 4, 175.00);
        Room manchester = new Room("Manchester", "Suite", 5, 250.0);
        Room piccadilly = new Room("Piccadilly", "Guest Room", 3, 125.0);
        Room oxford = new Room("Oxford", "Suite", 5, 225.0);

        Collection<Room> rooms =List.of(cambridge, manchester, piccadilly, oxford);
        double total = getPotentialRevenue(rooms);
        System.out.println(total);
    }

    private static double getPotentialRevenue(Collection<Room> rooms) {
        return rooms.stream()
                .mapToDouble(r -> r.getRate())// is a lambda expression. For each Room object r in the stream,
                // it calls the getRate method, which presumably returns the rate (or price) of the room as a double.
                .sum();
    }



}
