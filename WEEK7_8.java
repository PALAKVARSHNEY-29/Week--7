public class WEEK7_8 {
    public static void main(String[] args) {
        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() != s2.length()) {
            System.out.println("not anagram");
            return;
        }

        // Manually convert strings to char arrays
        char[] arr1 = new char[s1.length()];
        char[] arr2 = new char[s2.length()];

        for (int i = 0; i < s1.length(); i++) {
            arr1[i] = s1.charAt(i);
            arr2[i] = s2.charAt(i);
        }

        // Manually sort arrays
        bubbleSort(arr1);
        bubbleSort(arr2);

        // Compare arrays
        boolean isAnagram = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Given String is anagram");
        } else {
            System.out.println("not anagram");
        }
    }

    // Manual Bubble Sort
    public static void bubbleSort(char[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
