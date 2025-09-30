public class Sort {
    public static void main(String[] args) {
        
    }
}

// You can view one photo in DSA Java see that ......

/*
STREAM => int[] sorted = Arrays.stream(arr).sorted().toArray();

 🔧 1. Using Arrays.sort() (Built-in)
java
int[] arr = {5, 2, 8, 1};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr)); // [1, 2, 5, 8]

📦 2. Using Collections.sort() (For Lists)
List<Integer> list = Arrays.asList(5, 2, 8, 1);
Collections.sort(list);
System.out.println(list); // [1, 2, 5, 8]

🧠 3. Custom Comparator (Descending or Complex Sort)
java
List<String> names = Arrays.asList("Harshit", "Amit", "Zara");
names.sort((a, b) -> b.compareTo(a)); // Descending

🧪 4. Manual Sorting Algorithms (For Interviews)
🔁 Bubble Sort
java
for (int i = 0; i < arr.length - 1; i++) {
    for (int j = 0; j < arr.length - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {
            int temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
        }
    }
}
⚡ Quick Sort (Recursive)
java
public static void quickSort(int[] arr, int low, int high) {
    if (low < high) {
        int pi = partition(arr, low, high);
        quickSort(arr, low, pi - 1);
        quickSort(arr, pi + 1, high);
    }
}
✅ Fast average-case: O(n log n)

✅ Great for coding platforms
 */

