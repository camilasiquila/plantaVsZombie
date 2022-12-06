package graphicsObjects;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Graphic {

    protected Image imgGraphic;
    protected ImageIcon icon;
    protected int xCoord;
    protected int yCoord;

    public Graphic(int xCoord, int yCoord){
        this.xCoord = xCoord;
        this.yCoord = yCoord;
    }

    public void move(){
        this.xCoord -= 10;
    }
    public void draw (Graphics graphic1){
        Graphics2D graphics2 = (Graphics2D) graphic1;
        if(imgGraphic != null){
            graphics2.drawImage(imgGraphic, xCoord, yCoord, 80, 100, null);
        }
    }
}
