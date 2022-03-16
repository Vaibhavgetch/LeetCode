class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stk = new Stack<>() ;
        HashSet<Integer> hs = new HashSet<>() ;
        
        int push = 0 ;
        
        for(int pop = 0 ;  pop < popped.length ; pop++){
            if(hs.contains(popped[pop])== true){
                if(stk.size() == 0 || stk.peek() != popped[pop])
                    return false ;
                else{stk.pop();}    
            }
            else{
                  while(push < pushed.length && pushed[push] != popped[pop]){
                    stk.push(pushed[push]);
                    hs.add(pushed[push]);
                    push++;
                }
                push++; // For the element to be popped
            }
        }
        return ((stk.size() == 0) ? true : false); 
    }
}