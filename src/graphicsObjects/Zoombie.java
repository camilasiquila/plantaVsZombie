package graphicsObjects;


import graphicsObjects.Graphic;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Zoombie extends Graphic{

    public Zoombie(int xCoord, int yCoord) {
        super(xCoord, yCoord);
        icon = new ImageIcon(getClass().getResource("/images/Plants-vs-Zombies-2-14.jpg"));
        imgGraphic = icon.getImage();
    }

    @Override
    public void move(){
        xCoord -= 3;
    }

    @Override
    public void draw(Graphics graphic1){
        Graphics2D graphic2 = (Graphics2D)graphic1;
        graphic2.drawImage(imgGraphic, xCoord, yCoord, 80, 110, null);
    }

}

