import java.util.*;
class course_schedule {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int V = numCourses;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] e : prerequisites){
            int u = e[0];
            int v = e[1];
            adj.get(v).add(u);
        }
        int count = 0 ;
        int[] indegree = new int[V];
        for(int i=0;i<V;i++){
            for(int neigh : adj.get(i)){
                indegree[neigh]++;
            }
        }
        for(int i =0;i<V;i++){
            if(indegree[i]==0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int node = queue.poll();
            count++;
            for(int neigh : adj.get(node)){
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    queue.offer(neigh);
                }
            }
        }
        return count==V;
    }
}
//[1,0]

//[1,0]
//[0,1]