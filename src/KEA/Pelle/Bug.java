package KEA.Pelle;

public class Bug {
    private Block blockMaze[][];

    public Bug(){
        Maze maze = new Maze();
        maze.makeMaze();
        blockMaze = maze.getMaze();
    }

    public void findStart(){
    }
}
