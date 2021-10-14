package connect4.types;

public enum Direction {
    HORIZONTAL(1,0),
    VERTICAL(0,1),
    DIAGONAL(1,1),
    INVERSEDIAGONAL(1,-1)
    ;

    private int x;
    private int y;

    private Direction(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }
}
