package Connect4;

public enum Color {
    RED("X"),
    YELLOW("Y"),
    NULL("-");

    private String color;

    static Color get(int ordinal){
        assert ordinal >= 0 && ordinal < Color.NULL.ordinal();

        return Color.values()[ordinal];
    }

    Color(String color){
        this.color = color;
    }

    boolean isNull(){
        return this == Color.NULL;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
