package PingPong;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import javazoom.jl.player.Player;

public class Music extends Thread
{
    private Player player;
    private boolean isloop;//반복여부 정하기
    private File file;
    private FileInputStream fis;
    private BufferedInputStream bis;

    //생성자 부분
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

    //음악종료
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