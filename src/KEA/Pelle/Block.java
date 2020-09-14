package KEA.Pelle;

public class Block {
    int top;
    int bottom;
    int left;
    int right;

    public Block(int top, int bottom, int left, int right) {
        this.top = top;
        this.bottom = bottom;
        this.left = left;
        this.right = right;
    }


    @Override
    public String toString() {
        return "Block{" +
                "top=" + top +
                ", bottom=" + bottom +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
