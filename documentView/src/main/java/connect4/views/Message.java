package connect4.views;

public enum Message {

    WELCOME("Vamos a jugar al conecta4"),
    TURN("Es el turno de "),
    WIN("ENHORABUENA! HA GANADO EL JUGADOR "),
    DRAW("EL JUEGO HA QUEDADO EN EMPATE"),
    ERRORINPUT("Por favor introduzca un valor correcto"),
    COLUMN("Elija una columna");

    private String message;
    Message(String message){
        this.message  = message;
    }

    @Override
    public String toString() {
        return this.message;
    }
}
