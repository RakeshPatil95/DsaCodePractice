package gfgselfplaced.strings;

public class CheckIfStringsAreRotationOfEachOther {
    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "forgeeksgeeks";
        System.out.println( areRotation(s1,s2));


    }

    private static boolean areRotation(String s1, String s2) {
//        String s3 = s1+s1;
//        System.out.println(s3);
//        return s3.contains(s2); taking more time
//        if(s1.length() != s2.length()){
//            return  false;
//        }
//        if(s1.equals(s2)){
//            return true;
//        }
//
//        for (int i = 0; i < s2.length(); i++) {
//            if(s2.charAt(i) == s1.charAt(0)){
//                String temp=s2.substring(i).concat(s2.substring(0,i));
//                if(temp.equals(s1)){
//                    return true;
//                }
//            }
//        }
//        return false;
        String ans=s1+s1;
        if(s1.length()==s2.length() && ans.lastIndexOf(s2)!=-1)
            return true;
        return false;
    }
}
