class Solution {
    public String removeKdigits(String num, int k) {
         
        int len = num.length();
		
		//return 0 if k is equal to the length of the string as all the elements will get removed.
		if(k == len) return "0";
        
		Stack<Character> stack = new Stack<>();
        
        int i = 0;  // this will act as a pointer that will iterate the string
        while(i < len){
            // removing elements of the stack if they are greater than the current character.
			// this will work because java uses its own sorting method and knows that  characters '0' < '1' and so on
            while(k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)){
                
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
            i++;
        }
		
        //this is for the cases containing duplicates as 1111 and where the required 
		//number of element have not been removed.
        while(k > 0){
            stack.pop();
            k--;
        }
        
        StringBuilder sb = new StringBuilder(); // we will store the values of the stack in this.
        
        while(!stack.isEmpty())
            sb.append(stack.pop());
        
        sb.reverse(); // reversing because stack uses last in first out.
        
		// this loop is for deleting the zeroes present at the beginning. eg: "0013" = "13"
        while(sb.length() > 1 && sb.charAt(0) == '0')
            sb.deleteCharAt(0);
        
        return sb.toString();
    }
}