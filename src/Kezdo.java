public class Kezdo extends Jatekos{
    private String nev = "Kezdo";

    public void lep(){
        System.out.println(this.toString() + pnum + " kor: " + a.getKor());
        if (a.getKor() % 2 == 0){
            a.emel(1);
        }
    }

    public void Jatekos(String neve){
        nev = neve;
    }

    public String toString(){
        return nev;
    }

}
