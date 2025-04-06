package gfgselfplaced.arrays;

import java.util.HashMap;

public class SubArrayEqualsK {
    public static void main(String[] args) {
        int[] nums = new int[]{1,1,2,5,8,1,9};
        int k=9;
        int count=0;
        int cumSum=0;
        HashMap<Integer,Integer> preMap=new HashMap<>();
        preMap.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            cumSum+=nums[i];
            if(preMap.containsKey(cumSum-k))
            {
               count+=preMap.get(cumSum-k);
            }
            preMap.put(cumSum,preMap.getOrDefault(cumSum,0)+1);

        }
        System.out.println(count);





    }
}
