public class PopulationProjection {
    public static void main(String[] args) {
        System.out.println("Seconds in a year: " + (365 * 24 * 60 * 60));
        System.out.println("Year 1: " + (312032486 + (31536000 / 7.0 + 31536000 / 45.0 - 31536000 / 13.0)));
        System.out.println("Year 2: " + (312032486 + 2 * (31536000 / 7.0 + 31536000 / 45.0 - 31536000 / 13.0)));
        System.out.println("Year 3: " + (312032486 + 3 * (31536000 / 7.0 + 31536000 / 45.0 - 31536000 / 13.0)));
        System.out.println("Year 4: " + (312032486 + 4 * (31536000 / 7.0 + 31536000 / 45.0 - 31536000 / 13.0)));
        System.out.println("Year 5: " + (312032486 + 5 * (31536000 / 7.0 + 31536000 / 45.0 - 31536000 / 13.0)));
    }
}
