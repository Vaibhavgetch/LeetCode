class Solution {
    public int shortestPathLength(int[][] graph) {
         if (graph == null || graph.length <= 1)
            return 0;
        int n = graph.length;
        int finalBit = (1<<n) - 1;
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i< n; i++)
            queue.add(new int[]{i, 1<<i});
        int[][] visited = new int[n][finalBit+1];
        int result = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            result++;
            for (int i = 0; i<size; i++){
                int[] head = queue.poll();
                int nodeId = head[0];
                int bitState = head[1];
                for (int neighbor: graph[nodeId]){
                    int newBitState = bitState | (1<< neighbor);
                    if (visited[neighbor][newBitState] == 1)
                        continue;
                    if (newBitState == finalBit)
                        return result;
                    visited[neighbor][newBitState]=1;
                    queue.add(new int[]{neighbor, newBitState});
                }
            }
        }
        return -1;
    }
}