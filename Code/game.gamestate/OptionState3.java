package game.gamestate;

import game.GamePanel;
import game.resources.Images;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;

public class OptionState3 extends GameState{
    private final String ques="Do you like Deserts or Clouds?";
     private final String[] options = {"Deserts","Cloud"};
    private int currentSelection = 0;
    public OptionState3(GameStateManager gsm) {
        super(gsm);
    }

    public void init() {}
    
    public void tick() {}

    public void draw(Graphics g) {
        
        Graphics2D g2 = (Graphics2D)g;
        
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        
        if(0 == currentSelection){
            g2.drawImage(Images.blocks[12],0, 0, 900, 600, null);
        } else {
            g2.drawImage(Images.blocks[13],0, 0, 900, 600, null);
        }
        
        for (int i = 0; i < options.length; i++){
            if(i == currentSelection){
                g2.setColor(Color.GREEN);
            } else {
                g2.setColor(Color.WHITE);
            }
            
            //g.drawLine(GamePanel.WIDTH/2, 0, GamePanel.WIDTH/2, GamePanel.HEIGHT);
            g2.setFont(new Font("Arial", Font.PLAIN, 72));
            g2.drawString(options[i], GamePanel.WIDTH/2-100, 300+ i*150);
        }
        
        g2.setColor(Color.WHITE);
        g2.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
        g2.drawString(ques, GamePanel.WIDTH/2-300, GamePanel.HEIGHT/2-100);
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
                    gsm.states.push(new DesertState(gsm));
                    break;
                case 1:
                     gsm.states.push(new CloudState(gsm));
                    break;
                default:
                    break;
            }
        }
    }

    public void keyReleased(int k) {
        
    }
}
