import java.util.HashMap;

public class Assignment {
    public static int countEqual012Substrings(String s) {
        // HashMap to store the relative count difference between 0, 1, 2
        HashMap<String, Integer> countMap = new HashMap<>();
        int count0 = 0, count1 = 0, count2 = 0;
        int substringCount = 0;

        // Initialize map with the base case (0, 0, 0) having one occurrence
        countMap.put("0#0", 1);

        for (char ch : s.toCharArray()) {
            // Update the counts based on the current character
            if (ch == '0') count0++;
            else if (ch == '1') count1++;
            else if (ch == '2') count2++;

            // Calculate the difference between the counts of 0, 1, and 2
            String key = (count0 - count1) + "#" + (count0 - count2);

            // If this difference has been seen before, increment the count of substrings
            substringCount += countMap.getOrDefault(key, 0);

            // Add the current difference to the map
            countMap.put(key, countMap.getOrDefault(key, 0) + 1);
        }

        return substringCount;
    }
    public static void main(String args[]) {
        String s = "102100211";
        int result = countEqual012Substrings(s);
        System.out.println("Number of substrings with equal number of 0, 1, 2: " + result);
    }
    }

