package dsalgo.Graph.NumberOfIslands;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfIslands {

    Map<String, List<String>> posMap = new HashMap<>();

    public void identifyAllLands(char a[][]) {
        int count =0;
        boolean[][] visited = new boolean[100][100];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                if(a[i][j] == '1' && !visited[i][j]){
                   // visited[i][j] = true;
                    count++;
                    dfs(a,visited,i,j);
                }
            }
        }
        System.out.println("count :"+count);
    }

    private void dfs(char[][] a,boolean[][] visited, int i, int j) {
        int rows = a.length;
        int cols = a[0].length;
        if(i<0 || j<0 || i>=rows || j>=cols || a[i][j]!='1'|| visited[i][j]) return;
       // a[i][j]=0;
        visited[i][j]=true;
        dfs(a,visited,i,j-1); //left
        dfs(a,visited,i,j+1); //right
        dfs(a,visited,i-1,j); // top
        dfs(a,visited,i+1,j); //bottom
    }
// char[][] input = {
//                {'0','1','1','1','0'},
//                {'0','1','0','1','0'},
//                {'1','1','0','0','0'},
//                {'0','0','0','0','0'}
//        };

}
