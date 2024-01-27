public class CustomRandomNumberGenerator {
    private long seed;

    public CustomRandomNumberGenerator(long seed) {
        this.seed = seed;
    }

    public int generateRandomNumber(int min, int max) {
        if (min >= max) {
            throw new IllegalArgumentException("Invalid range. Max must be greater than min.");
        }

        // Constants for the linear congruential generator
        long a = 1664525;
        long c = 1013904223;
        long m = (1L << 32);

        // Update the seed
        seed = (a * seed + c) % m;

        // Calculate the range (inclusive)
        long range = (long) max - min + 1;

        // Convert the generated number to the desired range and return
        return (int) ((seed % range + range) % range) + min;
    }

    public static void main(String[] args) {
        // Example usage
        long initialSeed = System.currentTimeMillis(); // You can use any initial seed value
        CustomRandomNumberGenerator customRandom = new CustomRandomNumberGenerator(initialSeed);

        // Define the range (inclusive)
        int min = 1;
        int max = 10;

        // Generate 10 random numbers within the specified range
//        for (int i = 0; i < 10; i++) {
//            int randomNumber = customRandom.generateRandomNumber(min, max);
//            System.out.println("Random Number " + (i + 1) + ": " + randomNumber);
//        }
        System.out.println(customRandom.generateRandomNumber(min, max));
    }
}
