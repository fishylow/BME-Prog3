import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Filesystem {

    File dir;
    public Filesystem(File f)
    {
        this.dir=f;
    }

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

    public void runcmd() throws IOException {
        String line = in.readLine();
        String[] cmd = line.split(" ");

        switch(cmd[0]){
            case "exit":
                exit(cmd);
                break;
            case "pwd":
                pwd(cmd);
                break;
            case "ls":
                ls(cmd);
                break;
            case "cd":
                cd(cmd);
                break;
            case "mkdir":
                mkdir(cmd);
                break;
            case "cp":
                cp(cmd);
                break;
            case "head":
                head(cmd);
                break;
            default:
                break;
        }
    }

    private void exit(String[] cmd){
        System.exit(0);
    }

    private void pwd(String[] cmd){
        try
        {
            System.out.println(dir.getCanonicalPath());
            int count = 0;
            for (File file: dir.listFiles())
                count++;
            System.out.println(count);
        }
        catch (IOException ex)
        {
            Logger.getLogger(Filesystem.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cd(String[] cmd){
        if (cmd[1].equals(".."))
            dir = dir.getParentFile();
        else
            dir = new File(dir, cmd[1]);

    }

    private void ls(String[] cmd){
        boolean l = cmd.length > 1 && cmd[1].equals("-l"); //TO FINISH
        for (File file: dir.listFiles())
        {
            System.out.println(file.getName());
        }
    }

    private void mkdir(String[] cmd){
        File newdir = new File(dir, cmd[1]);
        newdir.mkdir();
    }

    private void cp(String[] cmd) throws FileNotFoundException, IOException{
        FileInputStream fin = new FileInputStream(cmd[1]);
        FileOutputStream fout = new FileOutputStream(cmd[2]);
        int c;
        while((c = fin.read())!=-1)
        {
            fout.write(c);
        }
        fin.close();
        fin.close();

    }

    private void head(String[] cmd) throws FileNotFoundException, IOException{
        int n = 10;
        File f;
        if(cmd[1].equals("-n"))
        {
            n = Integer.parseInt(cmd[2]);
            f = new File(dir, cmd[3]);
        }
        else
            f = new File(dir, cmd[1]);
        BufferedReader in = new BufferedReader(new FileReader(f));
        for(int i = 0; i<n; i++)
            System.out.println(in.readLine());
        in.close();
    }
}