package BitManipulation;

public class NibbleSwapper {
    public static int swap(int n){
        int left = (n&15)<<4;
        int right = n>>4;
        return left+right;
    }

    public static void main(String[] args) {
        int num = 47;
        int result = swap(num);
        System.out.println(result);
    }
}
