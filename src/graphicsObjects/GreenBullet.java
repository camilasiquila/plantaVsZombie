package graphicsObjects;

import graphicsObjects.Graphic;
import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Image;
import javax.swing.ImageIcon;


public class GreenBullet extends Graphic {

    public GreenBullet(int xCoord, int yCoord) {
        super(xCoord, yCoord);
        icon = new ImageIcon(getClass().getResource("/images/green-bullet.png"));
        imgGraphic = icon.getImage();
    }

    @Override
    public void move(){
        xCoord += 8;
    }

    @Override
    public void draw(Graphics g){
        g.drawImage(imgGraphic, xCoord, yCoord, 30, 30, null);
    }

}
