package connect4.types;

public enum Color {
    RED("X"),
    YELLOW("Y"),
    NULL("-");

    private String color;

    public static Color get(int ordinal){
        assert ordinal >= 0 && ordinal < Color.NULL.ordinal();

        return Color.values()[ordinal];
    }

    Color(String color){
        this.color = color;
    }

    public boolean isNull(){
        return this == Color.NULL;
    }

    @Override
    public String toString() {
        return this.color;
    }
}
