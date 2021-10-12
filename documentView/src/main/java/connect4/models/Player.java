package connect4.models;

import connect4.types.Color;

import java.util.Scanner;

public class Player {
    private Color color;

    public Player(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return this.color;
    }

    public int getPut(Board board) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Jugador " + color + " en que columna quiere introducir la ficha: ");
        String line = scanner.nextLine();
        return Integer.parseInt(line) - 1;
    }
}