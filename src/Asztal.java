import java.util.Random;

public class Asztal {

    private Jatekos j[]= new Jatekos[10];
    private int pcount = 0;
    private double tet = 0;
    private int kor = 1;
    private double goal;

    public void ujJatek(){
        kor = 1;
        tet = 0;
        Random r = new Random();
        goal = 100 * r.nextDouble();
    }

    public void addJatekos(Jatekos uj){
        if (pcount < 10) {
            uj.setAsztal(this);
            j[pcount++] = uj;
        }
    }

    public int getKor(){
        return kor;
    }

    public void emel(double d){
        tet += d;
    }

    public void kor() {
        if (pcount == 0) throw (new NincsJatekos("az asztal ures."));
        for (int i = 0; i < pcount; i++){
            j[i].lep();
        }
        kor++;
        System.out.println(tet);
    }

    public double getTet(){
        return tet;
    }

}
