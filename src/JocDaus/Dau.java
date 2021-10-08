package JocDaus;
public class Dau {

    int dau = 0;
    int dau2 = 0;
    int dau3 = 0;

    public void jugar() {
        dau = (int) (Math.random()*6+1);
        dau2 = (int) (Math.random()*6+1);
        dau3 = (int) (Math.random()*6+1);
    }
}