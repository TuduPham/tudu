import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class Sun extends JPanel implements MouseListener{
    GamePanel gamepanel;
    Image sunIm;
    int sunX;
    int sunY;
    int endY;
    int destruct = 200;
    public Sun(GamePanel parent, int startX, int startY,int endY){
        this.gamepanel = parent;
        this.endY = endY;
        setSize( startY = 80, endY = 120 );
        setOpaque(isOpaque:false);
        sunX =startX;
        sunY = startY;
        setLocation(sunX,sunY);
        sunIm = new ImageIcon(this.getClass().getResource(name:"image/sun.png")).getImage();
        addMouseListener(this);
        
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(sunIm,x:0,y:0,observer:null);
    }
    public void advance(){
        if(sunY < endY){
            sunY += 4;
        } else {
            destruct --;
            if(destruct = 0){
                gamepanel.remove(this);
                gamepanel.activeSuns.remove(this);
            }
        }
        setLocation(sunX,sunY);
    }
    @Override
    public void mouseClicked(MouseEvent e){

    }
    @Override
    public void mousePressed(MouseEvent e){

    }
    @Override
    public void mouseReleased(MouseEvent e){
        gamepanel.setSunScore(gamepanel.getSunScore()+25);
        gamepanel.remove(this);
        gamepanel.activeSuns.remove(this);
    }
    @Override
    public void mouseEntered(MouseEvent e){

    }
    @Override
    public void mouseExited(MouseEvent e){

    }
}
    
