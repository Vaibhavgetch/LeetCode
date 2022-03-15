class Solution {
    public String minRemoveToMakeValid(String s) {
        Deque<Integer> q  = new ArrayDeque<>() ;
        
        StringBuilder str = new StringBuilder("");
        
        for(int i = 0 ; i < s.length() ; i++){
            char ch = s.charAt(i);
            
            if(ch == '('){
                q.addLast(i);
            }
            else if(ch == ')'){
                 if(q.isEmpty() || s.charAt(q.getLast()) == ')'){
                     q.addLast(i);
                 }
                else {
                    q.removeLast();
                }
            }
            
        }
        for(int i = 0 ; i < s.length() ; i++){
            if(q.size()>0 && q.getFirst() == i){
                q.removeFirst() ;
                continue ;
            }
            str.append(s.charAt(i));
        }
        
        return str.toString() ;
    }
}