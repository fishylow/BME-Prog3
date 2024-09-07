public class Robot extends Jatekos{
    private String nev = "Robot";

    public void lep(){
        System.out.println(this.toString() + " kor: " + a.getKor());
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
