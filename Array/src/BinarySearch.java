public class BinarySearch {
    public static int binarySearch(int[] arr, int l, int r, int x) {
        if (l <= r) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x);
            } else {
                return binarySearch(arr, mid + 1, r, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 6, 7, 9, 12, 34, 56 };
        int x = 56;
        for(int i:arr){
            System.out.print(i+"\t");
        }
        System.out.println();
        System.out.println(x+" is at "+binarySearch(arr, 0, arr.length - 1, x) + "th Index");
    }

}
