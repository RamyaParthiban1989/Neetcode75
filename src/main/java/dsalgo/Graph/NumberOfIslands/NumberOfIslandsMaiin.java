package dsalgo.Graph.NumberOfIslands;

public class NumberOfIslandsMaiin {

    public static void main(String[] args) {
        // Initialize a 2D array
        char[][] input = {
                {'0','1','1','1','0'},
                {'0','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        };

        // Call a method and pass the 2D array
       // print2DArray(input);
        new NumberOfIslands().identifyAllLands(input);
    }

    public static void print2DArray(char[][] arr) {
        System.out.println("Printing 2D array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // new line after each row
        }
    }
}
