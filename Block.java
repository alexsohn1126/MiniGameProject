package game.objects;

import game.gamestate.GameState;
import game.resources.Images;
import java.awt.Graphics;
import java.awt.Rectangle;


public class Block extends Rectangle {
    
    public static final int blockSize = 70;
    private int id;
    
    
    public Block(int x, int y, int id){
        setBounds(x,y,blockSize,blockSize);
        this.id = id;
    }
    
    public void tick(){
        
    }
    
    public void draw(Graphics g){
        if(id != 0){
            if(id == 1){
                g.drawImage(Images.blocks[id-1],x - (int)GameState.xOffset, y-(int)GameState.yOffset, width, height,null);
            }
        }
        
    }
    
    //getters and setters
    public void setId(int id){
        this.id=id;
    }
    
    public int getID(){
        return id;
    }
}
