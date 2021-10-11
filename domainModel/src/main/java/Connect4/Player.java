package Connect4;

import java.util.Scanner;

public class Player {
    private int color;

    public Player(int color) {
        this.color = color;
    }

    public int getColor() {
        return this.color;
    }

    public int getPut(Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador " + color + " en que columna quiere introducir la ficha: ");
        String line = scanner.nextLine();
        return Integer.parseInt(line) - 1;
    }
}