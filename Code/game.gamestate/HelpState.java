package game.gamestate;

import game.GamePanel;
import game.resources.Images;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;

public class HelpState extends GameState{
    private final String ques="Use A and D to move";
    private final String ques2="Use SpaceBar to jump";
    private final String ques3="Make it to the finish line without dying more than 3 times!";
    private final String[] options = {"Menu"};
    private int currentSelection = 0;
    public HelpState(GameStateManager gsm) {
        super(gsm);
    }

    public void init() {}
    
    public void tick() {}

    public void draw(Graphics g) {
        
        Graphics2D g2 = (Graphics2D)g;
        //BackGround
        g2.drawImage(Images.blocks[1],0, 0, 900, 600, null);
        //Hearts
        for(int i = 0; i < 3; i++){
            g2.drawImage(Images.blocks[15],GamePanel.WIDTH/2-400 + i*30, 200, 28, 25, null);
        }
        //FinishLine
        g2.drawImage(Images.blocks[16],GamePanel.WIDTH/2-400, 315, 20, 20, null);
        g2.drawImage(Images.blocks[17],GamePanel.WIDTH/2-400, 300, 20, 20, null);
        g2.drawImage(Images.blocks[18],GamePanel.WIDTH/2-400, 285, 20, 20, null);
        g2.drawImage(Images.blocks[17],GamePanel.WIDTH/2-400, 270, 20, 20, null);
        g2.drawImage(Images.blocks[19],GamePanel.WIDTH/2-400, 255, 20, 20, null);
        g2.drawImage(Images.blocks[20],GamePanel.WIDTH/2-400, 240, 20, 20, null);
        
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);

        for (int i = 0; i < options.length; i++){
            if(i == currentSelection){
                g2.setColor(Color.GREEN);
            } else {
                g2.setColor(Color.WHITE);
                
            }
            
            //g.drawLine(GamePanel.WIDTH/2, 0, GamePanel.WIDTH/2, GamePanel.HEIGHT);
            g2.setFont(new Font("Arial", Font.PLAIN, 45));
            g2.drawString(options[i], GamePanel.WIDTH/2-25, 400+ i*150);
        }
        
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Comic Sans MS", Font.PLAIN, 30));
        g2.drawString(ques, GamePanel.WIDTH/2-400, GamePanel.HEIGHT/2-100);
        g2.drawString(ques2, GamePanel.WIDTH/2-400, GamePanel.HEIGHT/2-150);
        g2.drawString(ques3, GamePanel.WIDTH/2-400, GamePanel.HEIGHT/2-200);
        
        g2.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        g2.drawString("< Keep your eyes on the heart count! Once it runs out, you die.", GamePanel.WIDTH/2-300, GamePanel.HEIGHT/2-58);
        g2.drawString("Reach this finish line to finish the level!", GamePanel.WIDTH/2-300, GamePanel.HEIGHT/2);
        
        
    }

    public void keyPressed(int k) {
        if (k == KeyEvent.VK_DOWN){
            currentSelection++;
            if(currentSelection >= options.length){
                currentSelection = 0;
            }
        } else if (k == KeyEvent.VK_UP){
            currentSelection--;
            if(currentSelection <0){
                currentSelection = options.length-1;
            }
        }
        
        if(k == KeyEvent.VK_ENTER){
            switch (currentSelection) {
                case 0:
                    gsm.states.push(new MenuState(gsm));
                    break;
                default:
                    break;
            }
        }
    }

    public void keyReleased(int k) {
        
    }
}
