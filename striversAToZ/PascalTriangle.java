package striversAToZ;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
//        Input: numRows = 5
//        Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

        System.out.println(methodImpl(5));
    }

    private static List<List<Integer>> methodImpl(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        List<Integer> secRow = new ArrayList<>();
        secRow.add(1);
        secRow.add(1);
        result.add(firstRow);
        result.add(secRow);
        for (int i = 2; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i ) {
                    temp.add(1);
                } else {
                    temp.add((result.get(i - 1).get(j - 1)) + (result.get(i - 1).get(j)));
                }
            }
            result.add(temp);
        }
        return result;
    }
}
