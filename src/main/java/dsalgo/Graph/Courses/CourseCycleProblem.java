package dsalgo.Graph.Courses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;

public class CourseCycleProblem {

    public static void main(String[] args) {
        int[][] prerequisites1 = {
                {0, 1},
                {1, 2},
                {2,1}
        };
       canFinish(3, prerequisites1);
        int[][] prerequisites2 = {
                {0, 1},{1,0}};
        int[][] prerequisites3 = {
                {0, 1},
                {0, 2},
                {2,1}
        };
        canFinish(3, prerequisites3);
        canFinish(2, prerequisites1);
    }
    static HashSet<Integer> path = new HashSet<>();
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        boolean result = false;
        for (int edge[] : prerequisites) {
            int i = edge[0];
            int j = edge[1];
            System.out.println(i+","+j);
            if(!addToPath(i,j)){
                result = false;
            }
            result = true;
        }
        System.out.println("Result : "+result);
        return result;
    }

   static boolean addToPath(int i,int j){
        if(path.isEmpty()){
            path.add(i);
            path.add(j);
            return true;
        }
        else{
            if(!path.contains(i) || !path.contains(j)){
                path.add(i);
                path.add(j);
                return true;
            }
            else{
                return false;
            }
        }
    }



       /* int rows = prerequisites.length;
        int cols = prerequisites[0].length;
        for(int i=0;i<numCourses;i++){
            for(int j=0;j<numCourses;j++){
                if(courseGrid[i][j] == 1) {
                    result = identifyCycle(prerequisites, courseGrid, visited,i,j);
                }
            }
        }
        System.out.println("Result : "+result);
        return true;
    }

    private static boolean identifyCycle(int[][] prerequisites, int[][] courseGrid, boolean[][] visited,int i,int j) {

        if(i<0 || j<0 || i>=courseGrid.length || j>=courseGrid[0].length || visited[i][j] ) {
            return false;
        }
        visited[i][j]=true;
        identifyCycle(prerequisites,courseGrid,visited,i,j-1);
        identifyCycle(prerequisites,courseGrid,visited,i,j+1);
        identifyCycle(prerequisites,courseGrid,visited,i-1,j);
        identifyCycle(prerequisites,courseGrid,visited,i+1,j);
        return true;*/

}
