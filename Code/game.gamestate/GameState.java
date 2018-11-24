package game.resources;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Images {
    
    public static BufferedImage[] blocks;
    
    public Images(){
        blocks = new BufferedImage[21];
        try{
            blocks[0] = ImageIO.read(getClass().getResourceAsStream("/Blocks/City.png"));
            blocks[1] = ImageIO.read(getClass().getResourceAsStream("/Blocks/MenuBG.jpg"));
            blocks[2] = ImageIO.read(getClass().getResourceAsStream("/Blocks/Pengu.png"));
            blocks[3] = ImageIO.read(getClass().getResourceAsStream("/Blocks/Forest.png"));
            blocks[4] = ImageIO.read(getClass().getResourceAsStream("/Blocks/Ice.png"));
            blocks[5] = ImageIO.read(getClass().getResourceAsStream("/Blocks/Lava.png"));
            blocks[6] = ImageIO.read(getClass().getResourceAsStream("/Blocks/Desert.png"));
            blocks[7] = ImageIO.read(getClass().getResourceAsStream("/Blocks/Cloud.png"));
            blocks[8] = ImageIO.read(getClass().getResourceAsStream("/Blocks/CityBG.jpg"));
            blocks[9] = ImageIO.read(getClass().getResourceAsStream("/Blocks/ForestBG.jpg"));
            blocks[10] = ImageIO.read(getClass().getResourceAsStream("/Blocks/IceBG.png"));
            blocks[11] = ImageIO.read(getClass().getResourceAsStream("/Blocks/LavaBG.png"));
            blocks[12] = ImageIO.read(getClass().getResourceAsStream("/Blocks/DesertBG.png"));
            blocks[13] = ImageIO.read(getClass().getResourceAsStream("/Blocks/CloudBG.png"));
            blocks[14] = ImageIO.read(getClass().getResourceAsStream("/Blocks/HeartEmpty.png"));
            blocks[15] = ImageIO.read(getClass().getResourceAsStream("/Blocks/HeartFill.png"));
            blocks[16] = ImageIO.read(getClass().getResourceAsStream("/Blocks/LetterF.png"));
            blocks[17] = ImageIO.read(getClass().getResourceAsStream("/Blocks/LetterI.png"));
            blocks[18] = ImageIO.read(getClass().getResourceAsStream("/Blocks/LetterN.png"));
            blocks[19] = ImageIO.read(getClass().getResourceAsStream("/Blocks/LetterS.png"));
            blocks[20] = ImageIO.read(getClass().getResourceAsStream("/Blocks/LetterH.png"));
            // FINISH > 16,17,18,17,19,20
            
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
