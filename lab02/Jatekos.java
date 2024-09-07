abstract public class Jatekos {
    protected Asztal a;
    protected int pnum;
    protected static int sum = 0;

    abstract public void lep();

    public Jatekos(){
        pnum = sum++;
    }

    public void setAsztal(Asztal asztal){
        a = asztal;
    }
}