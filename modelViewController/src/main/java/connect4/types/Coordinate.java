package connect4.types;

public class Coordinate {
    public final static int NUMROWS = 6;
    public final static int NUMCOLUMNS = 8;

    private int row;
    private int column;

    public Coordinate(int row, int column){
        this.row = row;
        this.column = column;
    }

    public Coordinate nextCoordinate(Direction direction){
        Coordinate nextCoordinate = new Coordinate(this.row + direction.getY(),
                this.column + direction.getX());
        return nextCoordinate;
    }

    public int getRow(){
        return this.row;
    }

    public int getColumn(){
        return this.column;
    }

    public boolean isValid(){
        if((row >= 0 && row < Coordinate.NUMROWS) &&
        (column >= 0 && column < Coordinate.NUMCOLUMNS)){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "[" + this.row + "," + this.column + "]";
    }
}
