class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int length = tops.length + 1;
        
        //Array to maintain frequency of numbers in tops array
        int[] countA = new int[7];
        
        //Array to maintain frequency of numbers in bottoms array
        int[] countB = new int[7];
        
        //Array to maintain frequency of same numbers in tops and bottoms array
        int[] same = new int[7];
        
        //Filling frequency of each no. in count arrays
        for(int i = 0 ; i < bottoms.length ; i++){
            countA[tops[i]]++;
            countB[bottoms[i]]++;
            if(tops[i] == bottoms[i]){
                same[tops[i]]++ ;
            }
        }
        // Majority element in the arrays
        int majority = -1 ;
        
        //Checking for potential majority element
        for(int i = 1 ; i <=6 ; i++){
            
            if(countA[i] + countB[i] - same[i] == tops.length){
                majority = i;
            }
        }
        
        //Returning minimum of majority no. frequency 
        //from both count arrays after removing no. of same occurences
        return majority == -1? -1 : Math.min(countA[majority],countB[majority]) - same[majority];
        
    }
}