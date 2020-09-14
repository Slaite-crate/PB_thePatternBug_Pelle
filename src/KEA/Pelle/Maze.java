package KEA.Pelle;

public class Maze {
    Block maze[][];
    Wall wall;

    public Maze(){
        wall = new Wall();
    }

    public void makeMaze(){
        int a = wall.getVerticalWall()[0].length;
        int b = wall.getHorizontalWall().length;
        maze = new Block[a][b];
        int tal = a;
        int count = 0;
        for (int i = 0; i < maze.length; i++){
            for (int j = 0; j < maze[i].length; j++) {
                count++;
                System.out.println(count);
                int top;
                int bot;
                int left;
                int right;
                top = wall.getHorizontalWall()[tal][j];
                bot = wall.getHorizontalWall()[tal-1][j];
                left = wall.getVerticalWall()[j][tal-1];
                right = wall.getVerticalWall()[j+1][tal-1];
                maze[i][j] = new Block(top,bot,left,right);
                System.out.println(maze[i][j]);
            }
            tal--;
        }
    }

    public Block[][] getMaze() {
        return maze;
    }

    public void drawMaze(){
        String result = "";
        String wall = "##";
        String space = "  ";
        for (int j = 0; j < maze[0].length; j++){
            if (maze[0][j].top == 1){
                result += wall+wall;
            } else {
                result += wall+space;
            }
        }
        result += wall;
        result += "\n";
        for (int i = 0; i < maze.length; i++){
            if (maze[i][0].left == 1){
                result += wall;
            }   else {
                result += space;
            }
            for (int j = 0; j < maze[i].length; j++){
                if (maze[i][j].right == 1){
                    result += space+wall;
                } else {
                    result += space+space;
                }
            }
            result += "\n";
            result += wall;
            for (int j = 0; j< maze[i].length; j++){
                if (maze[i][j].bottom == 1){
                    result += wall+wall;
                } else {
                    result += space+wall;
                }
            }
            result += "\n";
        }
        System.out.println(result);
    }
}
