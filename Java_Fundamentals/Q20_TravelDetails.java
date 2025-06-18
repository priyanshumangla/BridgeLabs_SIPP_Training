import java.util.Scanner;

public class Q20_TravelDetails{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter the From City: ");
        String fromCity = input.nextLine();

        System.out.print("Enter the Via City: ");
        String viaCity = input.nextLine();

        System.out.print("Enter the To City: ");
        String toCity = input.nextLine();

        // 2. Input distances in miles
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = input.nextDouble();

        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = input.nextDouble();

        // 3. Input travel times in minutes
        System.out.print("Enter time from " + fromCity + " to " + viaCity + " in minutes: ");
        double timeFromToVia = input.nextDouble();

        System.out.print("Enter time from " + viaCity + " to " + toCity + " in minutes: ");
        double timeViaToFinalCity = input.nextDouble();

        // 4. Calculate total distance in km (1 mile = 1.60934 km)
        double totalDistanceMiles = fromToVia + viaToFinalCity;
        double totalDistanceKm = totalDistanceMiles * 1.60934;

        // 5. Calculate total time
        double totalTimeMinutes = timeFromToVia + timeViaToFinalCity;

        
        System.out.println("\nThe Total Distance travelled by " + name + " from " + fromCity + " to " + toCity +
                " via " + viaCity + " is " + totalDistanceKm + " km and the Total Time taken is " +
                totalTimeMinutes + " minute(s)");

        input.close();
    }
}
