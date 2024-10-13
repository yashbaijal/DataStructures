import java.util.*;

public class BalancePayment {
    
    // Helper class to store the denomination, count of available items, and a flag to indicate whether it's a note or coin
    static class Denomination {
        int value;
        int count;
        boolean isNote; // true if it's a note, false if it's a coin

        public Denomination(int value, int count, boolean isNote) {
            this.value = value;
            this.count = count;
            this.isNote = isNote;
        }
    }

    public static Map<String, Map<Integer, Integer>> payBalance(int balance, List<Denomination> inventory) {
        // Separate coins and notes based on the flag
        List<Denomination> notes = new ArrayList<>();
        List<Denomination> coins = new ArrayList<>();

        for (Denomination denomination : inventory) {
            if (denomination.isNote) {
                notes.add(denomination);
            } else {
                coins.add(denomination);
            }
        }

        // Sort both lists by denomination value in descending order
        notes.sort((a, b) -> b.value - a.value);
        coins.sort((a, b) -> b.value - a.value);

        // Store the result for both notes and coins separately
        Map<Integer, Integer> noteResult = new LinkedHashMap<>();
        Map<Integer, Integer> coinResult = new LinkedHashMap<>();

        // Process notes first
        balance = payWithDenominations(balance, notes, noteResult);

        // Process coins if balance is still not zero
        if (balance > 0) {
            balance = payWithDenominations(balance, coins, coinResult);
        }

        // If we cannot pay the exact balance
        if (balance > 0) {
            System.out.println("Unable to pay the exact balance with the available inventory.");
            return Collections.emptyMap();
        }

        // Combine the result for both notes and coins
        Map<String, Map<Integer, Integer>> result = new LinkedHashMap<>();
        if (!noteResult.isEmpty()) {
            result.put("Notes", noteResult);
        }
        if (!coinResult.isEmpty()) {
            result.put("Coins", coinResult);
        }
        return result;
    }

    // Helper method to process a list of denominations (either notes or coins)
    private static int payWithDenominations(int balance, List<Denomination> denominations, Map<Integer, Integer> result) {
        for (Denomination denomination : denominations) {
            int denomValue = denomination.value;
            int availableCount = denomination.count;

            // Find the maximum number of notes/coins we can use for the current denomination
            int numToUse = Math.min(balance / denomValue, availableCount);

            if (numToUse > 0) {
                result.put(denomValue, numToUse);
                balance -= numToUse * denomValue;
            }

            // If balance becomes 0, we are done
            if (balance == 0) {
                break;
            }
        }
        return balance;
    }

    public static void main(String[] args) {
        // Example inventory with a mix of notes and coins (denomination, count, isNote)
        List<Denomination> inventory = new ArrayList<>();
        // Adding Notes
        inventory.add(new Denomination(500, 5, true)); // ₹500 note
        inventory.add(new Denomination(200, 5, true)); // ₹200 note
        inventory.add(new Denomination(100, 5, true)); // ₹100 note
        inventory.add(new Denomination(50, 5, true));  // ₹50 note
        inventory.add(new Denomination(20, 5, true));  // ₹20 note
        // Adding Coins
        inventory.add(new Denomination(10, 10, false)); // ₹10 coin
        inventory.add(new Denomination(5, 10, false));  // ₹5 coin
        inventory.add(new Denomination(2,10,false));
        inventory.add(new Denomination(1,10,false));
        int balance = 275;

        Map<String, Map<Integer, Integer>> result = payBalance(balance, inventory);

        // Print the result
        if (!result.isEmpty()) {
            System.out.println("Paid balance using:");

            // Print notes
            Map<Integer, Integer> notes = result.get("Notes");
            if (notes != null && !notes.isEmpty()) {
                System.out.println("Notes:");
                for (Map.Entry<Integer, Integer> entry : notes.entrySet()) {
                    System.out.println("Denomination ₹" + entry.getKey() + ": " + entry.getValue() + " note(s)");
                }
            }

            // Print coins
            Map<Integer, Integer> coins = result.get("Coins");
            if (coins != null && !coins.isEmpty()) {
                System.out.println("Coins:");
                for (Map.Entry<Integer, Integer> entry : coins.entrySet()) {
                    System.out.println("Denomination ₹" + entry.getKey() + ": " + entry.getValue() + " coin(s)");
                }
            }
        }
    }
}
