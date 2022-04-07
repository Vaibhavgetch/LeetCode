class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
        //Adding array elements to Max-Heap
        for(int i : stones){
            pq.add(i);
        }
        //Removid top 2 max elements, and adding the difference back to the pq
        while(pq.size() != 1){
            pq.add(pq.remove() - pq.remove());
        }
        
        return pq.remove() ;
    }
}