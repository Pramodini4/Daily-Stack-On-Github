public class LinearSearch {
    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40, 50};
        int key = 30;
        int found = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = 1;
                break;
            }
        }

        if (found == 0) {
            System.out.println("Element not found");
        }
    }
}