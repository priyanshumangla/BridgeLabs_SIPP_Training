import java.text.DecimalFormat;

public class Q10_EarthVolume {
    public static void main(String[] args) {
        
        double radiusKm = 6378.0;

        
        double radiusMiles = radiusKm * 0.621371;

        
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);

        
        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("The volume of earth in cubic kilometers is " + df.format(volumeKm3) +
                " and cubic miles is " + df.format(volumeMiles3));
    }
}
