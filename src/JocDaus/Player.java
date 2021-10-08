package JocDaus;
public class Player {
    private String name;
    private boolean ganada;
    private int perdidas = 0, victorias = 0, partidas = 0;
    Dau dau = new Dau();


    public Player() {
        ganada = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getGanada() {return ganada;}

    public void setGanada(boolean ganada) {
        this.ganada = ganada;
    }

    public void setVictorias(int victorias) {
        this.victorias += victorias;
    }

    public void setPartidas(int partidas) {
        this.partidas += partidas;
    }

    public void setPerdidas(int perdidas) {
        this.perdidas += perdidas;
    }

    public int getVictorias() {
        return victorias;
    }

    public int getPartidas() {
        return partidas;
    }

    public int getPerdidas() {
        return perdidas;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", ganada=" + ganada +
                '}';
    }
}