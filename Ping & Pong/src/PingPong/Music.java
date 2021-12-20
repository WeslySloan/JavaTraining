package PingPong;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class Music extends Thread
{
    private Player player;
    private boolean isloop;//�ݺ����� ���ϱ�
    private File file;
    private FileInputStream fis;
    private BufferedInputStream bis;

    //������ �κ�
    public Music(String name, boolean isloop)
    {
        try
        {
            this.isloop = isloop;
            file = new File("src/music/introMusic.mp3");
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);
            player = new Player(bis);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    //��������
    public void close()
    {
        isloop = false;
        player.close();
        this.interrupt();
    }

    @Override
    public void run()
    {
        try
        {
            do
            {
                fis = new FileInputStream(file);
                bis = new BufferedInputStream(fis);
                player = new Player(bis);
                player.play();
            }
            
            while (isloop);
        }
        catch (Exception e)
        {

        }
    }        
}