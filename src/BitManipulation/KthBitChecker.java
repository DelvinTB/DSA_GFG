package BitManipulation;

public class KthBitChecker {
    public static boolean checkBit(int n, int k){
        if(((n>>k)&1)==1)
            return true;
        return false;
    }

    public static void main(String[] args) {
        int n = 5;
        int k = 2;
        boolean res = checkBit(n,k);
        System.out.println(k+"bit is set:"+res);
    }
}
