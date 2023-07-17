import java.util.HashMap;
import java.util.Map;

class NumberCount {
    public static void main(String[] args) {
        Map<String, Integer> dictionary = new HashMap<>();
        dictionary.put("Number1", 12);
        dictionary.put("Number2", 24);
        dictionary.put("Number3", 36);
        dictionary.put("Number4", 45);
        dictionary.put("Number5", 52);
        dictionary.put("Number6", 63);
        dictionary.put("Number7", 71);
        dictionary.put("Number8", 82);
        dictionary.put("Number9", 94);
        int[] multiples = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int count = 0;
        for (int number : dictionary.values()) {
            boolean isMultiple = true;
            for (int multiple : multiples) {
                if (number % multiple != 0) {
                    isMultiple = false;
                    break;
                }
            }
            if (isMultiple) {
                count++;
            }
        }

        System.out.println("Total count of numbers that are multiples of [1, 2, 3, 4, 5, 6, 7, 8, 9]: " + count);
    }
}
