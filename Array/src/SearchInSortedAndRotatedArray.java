public class SearchInSortedAndRotatedArray {
    public static void main(String[] args) {
     int[] arr=new int[]{4,5,7,9,1,3};
     int k=4;
     int ans=search(arr, 0, arr.length-1, k);
        System.out.println(ans);
    }

    public static int search(int[] arr, int low, int high, int key) {
        if (low > high) {
            return -1;
        }
        int mid = low + (high - low) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[low] <= arr[mid]) {
            if (key <= arr[mid] && key >= arr[low]) {
                return search(arr, low, mid - 1, key);
            } else {
                return search(arr, mid + 1, high, key);
            }

        }
        if (key >= arr[mid] && key <= arr[high]) {
            return search(arr, mid + 1, high, key);
        }
        return search(arr, low, mid - 1, key);
    }
}
