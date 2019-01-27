import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import javax.swing.*;

public class Mouse {

  Graphics g;

  final private double PROPORTION = 0.5;
  // rectangle object representing the mouse
  private Rectangle mouse;

  // top left corner of the rectangle coordinates
  double x;
  double y;
  // units to go by
  final private int UNIT;

  /**
   * Creates mouse object on canvas
   * @param unit        uniform distance to move the mouse by
   * @param startingX   starting x coordinate, top left corner of cell/unit
   * @param startingY   starting y coordinate, top left corner of cell/unit
   */
  public Mouse(int unit, double startingX, double startingY) {
    this.UNIT = unit;

    // center of unit
    double unitCenterX = startingX + (UNIT / 2);
    double unitCenterY = startingY + (UNIT / 2);

    // from there get upper left corner of mouse and construct it
    double width = UNIT / PROPORTION;
    double height = UNIT / PROPORTION;
    x = unitCenterX - width;
    y = unitCenterY - height;
    mouse = new Rectangle( (int)x, (int)y, (int)width, (int)height );
  }

  // not used
  public int move() {
    return 0;
  }

  public void moveRight() {
    mouse.translate( UNIT, 0 );
  }

  public void moveLeft() {
    mouse.translate(-UNIT, 0);
  }

  public void moveUp() {
    mouse.translate(0, -UNIT);
  }

  public void moveDown() {
    mouse.translate( 0, UNIT );
  }

  public void paint(Graphics g) {
    g.setColor(Color.GREEN);
    g.fillRect( (int)mouse.getX(), (int)mouse.getY(), (int)mouse.getWidth(),
      (int)mouse.getHeight() );
  }
}
