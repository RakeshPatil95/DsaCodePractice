package gfgselfplaced.search;

public class SquareRoot {
    public static void main(String[] args) {
        System.out.println(mySqrt(10));

    }
    public static int mySqrt(int x) {
        int left = 0;
        int right = x;
        int result = 0;

        while(left<=right){
            int mid = (left+right)/2;
            long sqrOfmid = (long)mid*mid;
            if(sqrOfmid == x) return mid;
            if(sqrOfmid > x) {
                right=mid-1;
            }else{
                result = mid;
                left = mid+1;
            }
        }
        return result;
    }
}
