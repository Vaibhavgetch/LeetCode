class Solution {
    public int calPoints(String[] ops) {
        
        int total = 0 ;
        List<Integer> res = new ArrayList<>();
        
        for(String str: ops){
            
            if(str.equals("C")){
                res.remove(res.size() - 1);
            }
            else if(str.equals("D")){
                res.add(2 * res.get(res.size() - 1));
            }
            else if(str.equals("+")){
                res.add(res.get(res.size() - 1) + res.get(res.size() - 2) );
            }
            else{
                res.add(Integer.parseInt(str));
                
            }
            
            
        }
        
        for(int i : res){
            
            total += i ;
        }
        
        return total ;
        
    }
}