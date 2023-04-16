import java.awt.event.ActionEvent;
import javax.swing.*;
public class Peashooter extends Plant{
    public Timer shoot;
    public Peashooter(GamePanel parent, int x, int y){
        super(parent,x,y);
        shoot = new Timer(delay:1390,(ActionEvent e)->
        {
            System.out.println("Shoot");
            if(gamepanel.laneZombies.get(Y).size()>0){
                gamepanel.lanePeas.get(y).add(new Pea(gamepanel,y, 103 + this.x*100));
            }
        });
        shoot.start();
    
    }
    @Override
    public void stop(){
        shoot.stop();
    }
}