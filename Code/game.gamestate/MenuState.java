package game.gamestate;

import game.GamePanel;
import game.resources.Images;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;

public class MenuState extends GameState{
    
    private String[] options = {"Start","Help","Quit"};
    private int currentSelection = 0;
    public MenuState(GameStateManager gsm) {
        super(gsm);
    }

    public void init() {}
    
    public void tick() {}

    public void draw(Graphics g) {
        
        Graphics2D g2 = (Graphics2D)g;
        
        g2.drawImage(Images.blocks[1],0, 0, 900, 600, null);
        g2.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        
        for (int i = 0; i < options.length; i++){
            if(i == currentSelection){
                g2.setColor(Color.GREEN);
            } else {
                g2.setColor(Color.WHITE);
            }
            
            //g.drawLine(GamePanel.WIDTH/2, 0, GamePanel.WIDTH/2, GamePanel.HEIGHT);
            g2.setFont(new Font("Arial", Font.PLAIN, 72));
            g2.drawString(options[i], GamePanel.WIDTH/2-80, 100+ i*150);
        }
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
                    gsm.states.push(new OptionState1(gsm));
                    break;
                case 1:
                    
                    break;
                case 2:
                    System.exit(0);
                default:
                    break;
            }
        }
    }

    public void keyReleased(int k) {
        
    }
}
