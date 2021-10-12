package connect4;

import java.util.Scanner;

public class ConsoleReader {
    private static ConsoleReader consoleReader = new ConsoleReader();
    private Scanner scanner;

    public ConsoleReader(){
        this.scanner = new Scanner(System.in);
    }

    public static ConsoleReader getInstance(){
        return consoleReader;
    }

    public int getInteger(){
        String line = scanner.nextLine();
        return Integer.parseInt(line);
    }

}
