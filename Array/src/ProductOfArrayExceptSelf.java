public class ProductOfArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4 };

        // int[] temp=new int[arr.length];
        // int product;
        // for(int i=0;i<arr.length;i++){
        // product=1;
        // for(int j=0;j<arr.length;j++){
        // if(i==j){
        // continue;
        // }else{
        // product*=arr[j];
        // }
        // }
        // temp[i]=product;
        // }

        // for(int i:temp){
        // System.out.printf(i+" ");
        // }

        int[] right = new int[arr.length + 1];
        right[arr.length] = 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            right[i] = right[i + 1] * arr[i];
        }
        int leftProduct = 1;
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int lp = leftProduct;
            int rp = right[i + 1];
            res[i] = lp * rp;
            leftProduct *= arr[i];
        }
        for (int i : res) {
            System.out.printf(i + " ");
        }
    }
}
