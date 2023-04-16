import javax.swing.*;
import java.awt.*;
public class Pea {
    public int X;
    protected GamePanel gamepanel;
    public int peaLane;
    public Pea(GamePanel parent, int lane, int startX){
        this.gamepanel = parent;
        this.peaLane=lane;
        X = startX;
    }
    public void advance(){
        Rectangle Rec = new Rectangle(X, 130 + peaLane*120 , width:28, height:28);
        for(int i = 0; i < gamepanel.laneZombies.get(peaLane).size();i++){
            Zombie zombie = gamepanel.laneZombies.get(peaLane).get(i);
            Rectangle zRect = new Rectangle(zombie.X,109 + peaLane*120,width:400,height:120);
            if(Rec.intersects(zRect)){
                zombie.health -= 300;
                boolean exit = false;
                if(zombie.health < 0){
                    gamepanel.laneZombies.get(peaLane).remove(i);
                    GamePanel.setProgress(num:10);
                    exit = true;
                }
                gamepanel.lanePeas.get(peaLane).remove(this);
                if(exit) break;
            }
        }
        if(X >2000){
            gamepanel.lanePeas.get(peaLane).remove(this);
        }
        X +=15;
    }
}
