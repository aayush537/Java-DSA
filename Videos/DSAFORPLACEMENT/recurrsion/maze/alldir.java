public class alldir {
    // let us assume we can move in all directions
    static void path(boolean maze[][], int i, int j, String temp){
        if(i==maze.length-1 && j==maze[0].length-1){
            System.out.println(temp);
            return;
        }
        if(!maze[i][j]){
            return;
        }
        maze[i][j] = false;
        if(i<maze.length-1){
            path(maze, i+1, j, temp+'d');
        }
        if(j<maze[0].length-1){
            path(maze, i, j+1, temp+'r');
        }
        if(j>0){
            path(maze, i, j-1, temp+'l');
        }
        if(i>0){
            path(maze, i-1, j, temp+ 'u');
        }
        maze[i][j] = true;

    }
    public static void main(String[] args) {
        boolean maze[][] = {
            {true, true, true, true},
            {true, true, true, true},
            {true, true, true, true},
            {true, true, true, true},
        };
        path(maze, 0, 0, "");
    }
    
}
//original object is modified in every recurrsion call
// take a st
