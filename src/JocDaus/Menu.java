package JocDaus;
import java.util.Scanner;

public class Menu {
    Game game;
    ConfigGame configGame;
    private final Scanner sc = new Scanner(System.in);

    public Menu(Game game, ConfigGame configGame){
        this.game = game;
        this.configGame = configGame;
    }

    public void show(){
        menuPrincipal();
    }

    public void menuPrincipal() {
        int op;
        do {
            System.out.println("1. Juego de los dados");
            System.out.println("2. Exit");
            op = sc.nextInt();
            sc.nextLine();
            switch (op){
                case 1:
                    game.play();
                    break;
                case 2:
                    break;
                default:
                    System.out.println("ATENCIÓ!!!! ha de ser 1 o 2");
            }
        } while(op !=2);
    }
}