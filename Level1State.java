package game.gamestate;

import game.entities.Player;
import game.mapping.Map;
import game.resources.Images;
import java.awt.Graphics;

public class Level1State extends GameState{
    
    private Player player;
    private Map map;
    
    public Level1State(GameStateManager gsm){
        super(gsm);
    }

    public void init() {
        player = new Player(30,30);
        map = new Map ("/Maps/map1.map");
        
        xOffset = -350;
        yOffset = -250;
    }
    
    public void tick() {
        player.tick(map.getBlocks());
    }
    
    public void draw(Graphics g) {
        g.drawImage(Images.blocks[1], 0,0, 900,600, null);
        player.draw(g);
        map.draw(g);
    }
    
    public void keyPressed(int k) {
        player.keyPressed(k);
    }
    
    public void keyReleased(int k) {
        player.keyReleased(k);
    }
}
