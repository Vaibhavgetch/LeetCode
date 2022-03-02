class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = s.length() - 1 ;
        int j = t.length() - 1 ;
        
        //if length of 's' 
        while( i > -1 && i <= j){
            if(s.charAt(i) == t.charAt(j))
                i-- ;
            j-- ;
        }
        return i == -1 ;
    }
}