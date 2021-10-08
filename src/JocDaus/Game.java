package JocDaus;
import java.util.Scanner;

public class Game {
    private final Scanner sc = new Scanner(System.in);
    private ConfigGame configGame;
    private final Menu menuPrincipal;
    final Dau dau;
    String op;
    private final Player[] jugador = new Player[2];

    public Game() {
        menuPrincipal = new Menu(this, configGame);
        configGame = new ConfigGame();
        dau = new Dau();
        this.jugador[0] = new Player();
        this.jugador[1] = new Player();
        jugador[0].setName("Player" + 1);
        jugador[1].setName("Player" + 2);
    }

    public void start() {
        menuPrincipal.show();
    }

    public void play() {
        System.out.println("Juegas con " + configGame.getDau() + " dados.");
        System.out.println("Jugadores: " + configGame.getJugador());
        System.out.println("Se han lanzado los dados.");
        System.out.println();
        for (int i = 0; i < configGame.getJugador(); i++) {
            jugador[i].dau.jugar();
            System.out.println(jugador[i].getName() + " ha sacado estos numeros: " + jugador[i].dau.dau + " " + jugador[i].dau.dau2 + " " + jugador[i].dau.dau3);

            if (jugador[i].dau.dau == jugador[i].dau.dau2 && jugador[i].dau.dau2 == jugador[i].dau.dau3){
                jugador[i].setGanada(true);
            }
        }

        jugador[1].setPartidas(1);
        jugador[0].setPartidas(1);

        if (jugador[0].getGanada() && jugador[1].getGanada()) {
            System.out.println();
            System.out.println("Empate");

        }else if (jugador[0].getGanada()){
            System.out.println();
            System.out.println("Ha gando el " +jugador[0].getName());
            jugador[0].setVictorias(1);
            jugador[1].setPerdidas(1);
            jugador[0].setGanada(false);
        }else if (jugador[1].getGanada()){
            System.out.println();
            System.out.println("Ha gando el " +jugador[1].getName());
            jugador[1].setVictorias(1);
            jugador[0].setPerdidas(1);
            jugador[1].setGanada(false);
        }else{
            System.out.println();
            System.out.println("No ha ganado ningún jugador.");
        }

        System.out.println();
        System.out.print("Lanzo otra vez los dados? (s/n) ");
        op = sc.nextLine();
        if (op.equals("s")){
            play();
        }else{
            for (int i = 0; i < configGame.getJugador(); i++) {
                System.out.println(jugador[i].getName() + " ha ganado " + jugador[i].getVictorias() + ", ha perdido " + jugador[i].getPerdidas() + " y en total ha jugado " + jugador[i].getPartidas() + " partidas.");
            }
            System.out.println();
        }
    }
}