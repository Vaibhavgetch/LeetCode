class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int length = tops.length + 1;
        int[] countA = new int[7];
        int[] countB = new int[7];
        int[] same = new int[7];
        
        for(int i = 0 ; i < bottoms.length ; i++){
            countA[tops[i]]++;
            countB[bottoms[i]]++;
            if(tops[i] == bottoms[i]){
                same[tops[i]]++ ;
            }
        }
        
        int majority = -1 ;
        for(int i = 1 ; i <=6 ; i++){
            
            if(countA[i] + countB[i] - same[i] == tops.length){
                majority = i;
            }
        }
        
        return majority == -1? -1 : Math.min(countA[majority],countB[majority]) - same[majority];
        
    }
}