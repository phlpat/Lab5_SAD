package lsp;

public class Square extends Shape {

    private int side;

    Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public int getArea() {
        return side * side;
    }
}
