import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;
public class Card extends JPanel implements MouseListener{
    Image img;
    ActionListener a1;
    public Card(Image img){
        setSize(width:64,height:90);
        this.img=img;
        addMouseListener(this);
    }
    public void setAction(ActionListener a1){
        this.a1 =a1;
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img,x:0,y:0,observer:null);
    } 

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        a1.actionPerformed(new ActionEvent(this,ActionEvent.RESERVED_ID_MAX+1,command:""));
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        
    }
    
}
