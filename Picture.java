/**
 * This class represents a simple picture of two people on a seesaw.
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling, David J. Barnes, and Ashlyn Balicki
 * @version 2023.09.10
 */
public class Picture
{
    private Square sky;
    private Circle sun;
    private Square ground;
    private Triangle seesawBase;
    private Square seesawBar1, seesawBar2, seesawBar3, seesawBar4, seesawBar5;
    private Square[] seesawBar;
    private Person person1;
    private Person person2;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();
        sun = new Circle();
        ground = new Square();
        seesawBase = new Triangle();
        seesawBar1 = new Square();
        seesawBar2 = new Square();
        seesawBar3 = new Square();
        seesawBar4 = new Square();
        seesawBar5 = new Square();
        seesawBar = new Square[]{seesawBar1,seesawBar2,seesawBar3,seesawBar4,seesawBar5};
        person1 = new Person();
        person2 = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            sky.changeColor("skyblue");
            sky.setXPosition(0);
            sky.setYPosition(0);
            sky.changeSize(500);
            sky.makeVisible();
            
            ground.changeColor("green");
            ground.setXPosition(0);
            ground.setYPosition(175);
            ground.changeSize(500);
            ground.makeVisible();
            
            seesawBase.changeColor("red");
            seesawBase.setXPosition(250);
            seesawBase.setYPosition(200);
            seesawBase.changeSize(50,60);
            seesawBase.makeVisible();
            
            seesawBar1.changeColor("red");
            seesawBar1.changeSize(25);
            seesawBar1.setXPosition(seesawBase.getXPosition());
            seesawBar1.moveHorizontal(-seesawBar1.getSize()/2);
            seesawBar1.setYPosition(seesawBase.getYPosition());
            seesawBar1.moveVertical(-seesawBar1.getSize()+10);
            seesawBar1.makeVisible();
            
            seesawBar2.changeColor(seesawBar1.getColor());
            seesawBar2.moveHorizontal(seesawBar1.getXPosition()-310);
            seesawBar2.moveVertical(seesawBar1.getYPosition()-120);
            seesawBar2.changeSize(seesawBar1.getSize());
            seesawBar2.moveHorizontal(seesawBar2.getSize());
            seesawBar2.makeVisible();

            seesawBar3.changeColor(seesawBar1.getColor());
            seesawBar3.moveHorizontal(seesawBar1.getXPosition()-310);
            seesawBar3.moveVertical(seesawBar1.getYPosition()-120);
            seesawBar3.changeSize(seesawBar1.getSize());
            seesawBar3.moveHorizontal(seesawBar3.getSize()*2);
            seesawBar3.makeVisible();
            
            seesawBar4.changeColor(seesawBar1.getColor());
            seesawBar4.moveHorizontal(seesawBar1.getXPosition()-310);
            seesawBar4.moveVertical(seesawBar1.getYPosition()-120);
            seesawBar4.changeSize(seesawBar1.getSize());
            seesawBar4.moveHorizontal(-seesawBar4.getSize());
            seesawBar4.makeVisible();

            seesawBar5.changeColor(seesawBar1.getColor());
            seesawBar5.moveHorizontal(seesawBar1.getXPosition()-310);
            seesawBar5.moveVertical(seesawBar1.getYPosition()-120);
            seesawBar5.changeSize(seesawBar1.getSize());
            seesawBar5.moveHorizontal(-seesawBar5.getSize()*2);
            seesawBar5.makeVisible();
            
            sun.changeColor("yellow");
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(80);
            sun.makeVisible();
            
            person1.setXPosition(300);
            person1.setYPosition(145);
            person1.makeVisible();
           
            person2.setXPosition(200);
            person2.setYPosition(145);
            person2.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("white");
        sun.changeColor("black");
        ground.changeColor("darkgrey");
        for (Square part : seesawBar) {
            part.changeColor("grey");
        }
        seesawBase.changeColor("grey");
        person1.changeColor("black");
        person2.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("skyblue");
        sun.changeColor("yellow");
        ground.changeColor("green");
        for (Square part : seesawBar) {
            part.changeColor("red");
        }
        seesawBase.changeColor("red");
        person1.changeColor("black");
        person2.changeColor("black");
    }
}
