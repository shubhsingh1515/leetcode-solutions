class Solution {
    List<List<Integer>> ans;
    public void dfs (int curr, int end, int[][] graph, ArrayList<Integer> temp) {
        temp.add(curr);
        
        if (curr == end) {
            ans.add(new ArrayList<>(temp));
        }
        
        for (int next : graph[curr]) {
            dfs(next, end, graph, temp);
        }
        temp.remove(temp.size()-1);
    }
   public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        ans = new ArrayList<>();
        int end = graph.length-1;
        dfs(0, end, graph, new ArrayList<Integer>());
        return ans;
    }
}
