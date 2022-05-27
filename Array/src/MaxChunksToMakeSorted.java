public class MaxChunksToMakeSorted {
    public static void main(String[] args) {
        int[] arr=new int[]{1,0,2,4,3,5};
        int max=0;
        int cc=0;
        for(int i=0;i<arr.length;i++){
            max=Math.max(arr[i],max);
            if(i==max){
                cc++;
            }
        }
        System.out.println(cc);
    }
}
