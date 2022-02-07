class Solution {
    
    public int sum(String s){
        
        int sum = 0 ;
        for(int i = 0  ;i < s.length(); i++){
            sum += (int)s.charAt(i) ;
        }
        return sum ;
    }
    public char findTheDifference(String s, String t) {
        return (char)(sum(t) - sum(s));
        }
}