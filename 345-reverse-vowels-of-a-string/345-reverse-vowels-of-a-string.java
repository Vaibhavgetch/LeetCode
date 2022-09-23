class Solution {
    public boolean isVowel(char ch){
        
        if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ||
           ch == 'A' ||ch == 'E' ||ch == 'I' ||ch == 'O' ||ch == 'U' ){
            return true ;
        }
        return false ;
    }
    
    public String reverseVowels(String s) {
        int i = 0 ;
        int j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while(i < s.length() && isVowel(s.charAt(i)) == false ){
            i++ ;
        }
        while(j > 0 && isVowel(s.charAt(j)) == false ){    
            j-- ;
        }
        
        while(i < j){
            char temp = sb.charAt(i) ;
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j, temp);
            i++; j--;
             while(i < s.length() && isVowel(s.charAt(i)) == false ){
                i++ ;
            }
            
            while(j > 0 && isVowel(s.charAt(j)) == false ){
                j-- ;
            }
        }
            
        
        
        return sb.toString();
    }
}