package mark123mark.mods.transcraft;

import cpw.mods.fml.common.Loader;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.*;
import java.util.*;
import javax.swing.ImageIcon;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraftforge.client.event.RenderPlayerEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class EventCloakRender
{

    private final String serverLocation = "URL!";
    private final int timeout = 1000;

    private static final Graphics TEST_GRAPHICS = new BufferedImage(128, 128, BufferedImage.TYPE_INT_RGB).getGraphics();
    private HashMap<String, String> cloaks = new HashMap<String, String>();
    private ArrayList<AbstractClientPlayer> capePlayers = new ArrayList<AbstractClientPlayer>();

    public static EventCloakRender instance;

    public EventCloakRender()
    {
     //   buildCloakURLDatabase();
        instance = this;
        cloaks.put("mark123mark", "https://dl.dropboxusercontent.com/s/da22y3de0unde5y/TranscraftCape.png?dl=1&token_hash=AAEh0n_TlvX8xZ0ygpbj402vXhNxcdTeF85NcFlz27Hu4Q");
        cloaks.put("Drewzombie", "https://dl.dropboxusercontent.com/s/pni71ewt7r7bfjs/TranscraftCape2.png?dl=1&token_hash=AAGNCZskvTMdVKI9BUX2s3ev8g0SpLMXidpIPzqJDTKJkg");
        cloaks.put("DrumBaseCZ", "https://dl.dropboxusercontent.com/s/pni71ewt7r7bfjs/TranscraftCape2.png?dl=1&token_hash=AAGNCZskvTMdVKI9BUX2s3ev8g0SpLMXidpIPzqJDTKJkg");
        cloaks.put("shifu_", "https://dl.dropboxusercontent.com/s/pni71ewt7r7bfjs/TranscraftCape2.png?dl=1&token_hash=AAGNCZskvTMdVKI9BUX2s3ev8g0SpLMXidpIPzqJDTKJkg");
    }

    @ForgeSubscribe
    public void onPreRenderSpecials (RenderPlayerEvent.Specials.Pre event)
    {
        if (Loader.isModLoaded("shadersmod"))
        {
            return;
        }
        if (event.entityPlayer instanceof AbstractClientPlayer)
        {
            AbstractClientPlayer abstractClientPlayer = (AbstractClientPlayer) event.entityPlayer;

            if (!capePlayers.contains(abstractClientPlayer))
            {
                String cloakURL = cloaks.get(event.entityPlayer.username);

                if (cloakURL == null)
                {
                    return;
                }

                capePlayers.add(abstractClientPlayer);

                //SET PUBLIC IN DEV ENV!!!!
                
                abstractClientPlayer.getTextureCape().textureUploaded = false;
                new Thread(new CloakThread(abstractClientPlayer, cloakURL)).start();
                event.renderCape = true;
            }
        }
    }

    public void buildCloakURLDatabase ()
    {
        URL url;
        try
        {
            url = new URL(serverLocation);
            URLConnection con = url.openConnection();
            con.setConnectTimeout(timeout);
            con.setReadTimeout(timeout);
            InputStream io = con.getInputStream();
            BufferedReader br = new BufferedReader(new InputStreamReader(io));

            String str;
            int linetracker = 1;
            while ((str = br.readLine()) != null)
            {
                if (!str.startsWith("--"))
                {
                    if (str.contains(":"))
                    {
                        String nick = str.substring(0, str.indexOf(":"));
                        String link = str.substring(str.indexOf(":") + 1);
                        new Thread(new CloakPreload(link)).start();
                        cloaks.put(nick, link);
                    }
                    else
                    {
                        System.err.println("[Transcraft] [skins.txt] Syntax error on line " + linetracker + ": " + str);
                    }
                }
                linetracker++;
            }

            br.close();
        }
        catch (MalformedURLException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private class CloakThread implements Runnable
    {

        AbstractClientPlayer abstractClientPlayer;
        String cloakURL;

        public CloakThread(AbstractClientPlayer player, String cloak)
        {
            abstractClientPlayer = player;
            cloakURL = cloak;
        }

        @Override
        public void run ()
        {
            try
            {
                Image cape = new ImageIcon(new URL(cloakURL)).getImage();
                BufferedImage bo = new BufferedImage(cape.getWidth(null), cape.getHeight(null), BufferedImage.TYPE_INT_ARGB);
                bo.getGraphics().drawImage(cape, 0, 0, null);
                abstractClientPlayer.getTextureCape().bufferedImage = bo;
              //SET PUBLIC IN DEV ENV!!!!
            }
            catch (MalformedURLException e)
            {
                e.printStackTrace();
            }
        }
    }

    private class CloakPreload implements Runnable
    {
        String cloakURL;

        public CloakPreload(String link)
        {
            cloakURL = link;
        }

        @Override
        public void run ()
        {
            try
            {
                TEST_GRAPHICS.drawImage(new ImageIcon(new URL(cloakURL)).getImage(), 0, 0, null);
            }
            catch (MalformedURLException e)
            {
                e.printStackTrace();
            }
        }
    }

    public void refreshCapes ()
    {
        cloaks.clear();
        capePlayers.clear();
        buildCloakURLDatabase();
    }
}
