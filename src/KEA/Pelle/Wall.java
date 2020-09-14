package KEA.Pelle;

public class Wall {
    private int verticalWall[][];
    private int horizontalWall[][];

    public Wall(){
        horizontalWall = new int[][]{
                {1, 2, 1, 1, 1, 1},
                {0, 1, 1, 0, 0, 0},
                {1, 0, 0, 1, 0, 0},
                {0, 0, 1, 0, 1, 0},
                {1, 1, 1, 1, 0, 1},
                {1, 1, 3, 1, 1, 1}
        };
        verticalWall = new int[][]{
                {1, 1, 1, 1, 1},
                {0, 0, 1, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0},
                {1, 1, 0, 1, 0},
                {0, 1, 1, 0, 0},
                {1, 1, 1, 1, 1}
        };
    }

    public Wall(int[][] verticalWall, int[][] horizontalWall) {
        this.verticalWall = verticalWall;
        this.horizontalWall = horizontalWall;
    }

    public int[][] getVerticalWall() {
        return verticalWall;
    }

    public int[][] getHorizontalWall() {
        return horizontalWall;
    }
}
