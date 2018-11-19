
package game.gamestate;

import game.GamePanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;

public class OptionState1 extends GameState{
    private String ques="Do you like skyline or ground";
     private String[] options = {"Skyline","Ground"};
    private int currentSelection = 0;
    public OptionState1(GameStateManager gsm) {
        super(gsm);
    }

    public void init() {}
    
    public void tick() {}

    public void draw(Graphics g) {
        
        g.setColor(new Color(50,150,200));
        g.fillRect(0,0, GamePanel.WIDTH, GamePanel.HEIGHT);
        for (int i = 0; i < options.length; i++){
            if(i == currentSelection){
                g.setColor(Color.GREEN);
            } else {
                g.setColor(Color.WHITE);
            }
            
            //g.drawLine(GamePanel.WIDTH/2, 0, GamePanel.WIDTH/2, GamePanel.HEIGHT);
            g.setFont(new Font("Arial", Font.PLAIN, 72));
            g.drawString(options[i], GamePanel.WIDTH/2+10, 300+ i*150);
        }
        g.setColor(Color.WHITE);
        g.setFont(new Font("Comic Sans MS", Font.PLAIN, 45));
        g.drawString(ques, GamePanel.WIDTH/2-300, GamePanel.HEIGHT/2-50);
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
                    gsm.states.push(new Level1State(gsm));
                    break;
                case 1:
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
