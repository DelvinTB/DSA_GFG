package BitManipulation;

public class SingleElementFinder {
    public static int findElement(int n, int[] arr){
        int res=0;
        for(int i=0; i<n; i++){
            res= res ^ arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[] = {1,1,2,2,4,5,5};
        int ans = findElement(arr.length, arr);
        System.out.println(ans);
    }
}
