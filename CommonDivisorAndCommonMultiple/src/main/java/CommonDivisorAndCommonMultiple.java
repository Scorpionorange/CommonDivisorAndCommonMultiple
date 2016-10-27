/**
 * Created by ScorpionOrange on 2016/10/27.
 */
public class CommonDivisorAndCommonMultiple {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println(new Solution().findMaxCommonDivisor(544, 17));
        System.out.println(new Solution().findMinCommonMultiple(544, 17));
    }
}

class Solution{
    public int findMaxCommonDivisor(int m, int n){
        if(m == 0 || n == 0){
            return -1;
        }
        else if( n > m){
            m = m ^ n;
            n = m ^ n;
            m = m ^ n;
        }
        while (m % n != 0){
            int temp = m % n;
            m = n;
            n = temp;
        }
        return n;
    }

    public int findMinCommonMultiple(int m, int n){
        return m * n / findMaxCommonDivisor(m, n);
    }
}