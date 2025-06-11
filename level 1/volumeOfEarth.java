public class volumeOfEarth {
    public static void main(String[] args) {
        int earthRadius = 6378;
        double volumeKm = ((double)4/(double)3) * Math.PI * Math.pow(earthRadius, 3);
        
        double volumeMiles = volumeKm / Math.pow(1.6, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
