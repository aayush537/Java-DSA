public class MazeWithOnstacle {
    static void MazeWithObstacle(String p, boolean[][]maze, int r, int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(maze[r][c]==false){
            return;
        }
        if(r<maze.length-1){
            MazeWithObstacle(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            MazeWithObstacle(p+'R', maze, r, c+1);
        }

    }
    public static void main(String[] args) {
        boolean result[][] = {
            {true, true, true},
            {true, false, true},
            {true, true, true},
            
        };
        MazeWithObstacle("", result, 0, 0);
    }
}
