import java.awt.*;
public class IcePea extends Pea {
    public IcePea(GamePanel parent,int lane,int startX){
        super(parent,lane,startX);
    }
    @Override
    public void advance(){
        Rectangle Rec = new Rectangle(X,130 + peaLane*120,width:28,height:28);
        for (int i = 0; i < gamepanel.laneZombies.get(peaLane).size();i++){
            Zombie zombie = gamepanel.laneZombies.get(peaLane).get(i);
            Rectangle zRect = new Rectangle(zombie.X,109 + peaLane*120,width:400,height:120);
            if(Rec.intersects(zRect)){
                zombie.health -= 300;
                zombie.slow();
                boolean exit = false;
                if(zombie.health < 0){
                    System.out.println(x:"Zombie die");
                    GamePanel.setProgress(num: 10);
                    gamepanel.laneZombies.get(peaLane).remove(i);
                    exit = true;
                }
                gamepanel.lanePeas.get(peaLane).remove(this);
                if (exit) break;
            } 
        }
        if( X >2000){
            gamepanel.lanePeas.get(peaLane).remove(this);
        }
        X += 15;
        }
    
}
