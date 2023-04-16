public abstract class Plant{
    public int hp = 200;
    public int x;
    public int y;
    public GamePanel gamepanel;
    public Plant(GamePanel parent,int x,int y){
        this.x=x;
        this.y=y;
        gamepanel = parent;
    }
    public void stop(){
        
    }
}