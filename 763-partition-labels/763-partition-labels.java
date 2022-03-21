class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character,Integer> hm= new HashMap<>() ;
        
        int max = -1;
        int prev = -1 ;
        for(int i = 0 ; i < s.length(); i++){
            char ch  = s.charAt(i);
            hm.put(ch,i);
        }
        
        List<Integer> res = new ArrayList<>() ;
        for(int i = 0 ; i < s.length(); i++){
            max = Math.max(max, hm.get(s.charAt(i)));
            if(max == i){
                res.add(max - prev);
                prev = max ;
            }
            
        }
        return res ;
    }
}