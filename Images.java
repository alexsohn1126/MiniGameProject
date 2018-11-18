package game.resources;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Images {
    
    public static BufferedImage[] blocks;
    
    public Images(){
        blocks = new BufferedImage[2];
        try{
            blocks[0] = ImageIO.read(getClass().getResourceAsStream("/Blocks/brick.png"));
            blocks[1] = ImageIO.read(getClass().getResourceAsStream("/Blocks/backGround.jpg"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
