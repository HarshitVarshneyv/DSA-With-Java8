public class Swap {
    public static void main(String[] args) {
        
    }
}

/* 
🔁 1. Using a Temporary Variable (Recommended)
java
int temp = arr[i];
arr[i] = arr[j];
arr[j] = temp;

🧠 2. Using Arithmetic (No Temp Variable)
java
arr[i] = arr[i] + arr[j];
arr[j] = arr[i] - arr[j];
arr[i] = arr[i] - arr[j];
⚠️ Risky if i == j (zeroes out value)

⚠️ Can overflow for large integers

🧰 4. Using Collections.swap() (For Lists)
java
List<Integer> list = Arrays.asList(1, 2, 3, 4);
Collections.swap(list, 0, 3); // swaps 1 and 4
✅ Clean for List<T>
✅ No manual temp variable


🧪 5. Using a Utility Method same as 1
java
public static void swap(int[] arr, int i, int j) {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
}
*/