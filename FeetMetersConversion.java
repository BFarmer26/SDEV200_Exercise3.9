public class FeetMetersConversion {
    
    /** Converts feet to meters */
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    /** Converts meters to feet */
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }

    /** Displays table of conversions */
    public static void main(String[] args) {
        System.out.println("\nFeet      Meters    |    Meters      Feet\n");
        System.out.println("--------------------|-----------------------");
        for (double feet = 1.0, meters = 20.0; feet <= 10.0; feet++, meters += 5)
        {
            System.out.printf("%4.1f\t%10.3f\t|\t%-11.1f\t%8.3f\n", feet, footToMeter(feet), meters, meterToFoot(meters));
        }
    }
}
