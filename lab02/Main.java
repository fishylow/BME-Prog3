//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Asztal a = new Asztal();
        a.ujJatek();
        a.addJatekos(new Kezdo());
        a.addJatekos(new Kezdo());
        a.addJatekos(new Robot());
        for (int i = 0; i < 3; i++){
            a.kor();
        }

    }
}

