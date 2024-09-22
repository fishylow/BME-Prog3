import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        Filesystem wd=new Filesystem(new File(System.getProperty("user.dir")));

        try
        {
            while(true)
                wd.runcmd();
        }
        catch (IOException ex)
        {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}