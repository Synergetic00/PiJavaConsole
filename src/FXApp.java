import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.shape.ArcType;

public class FXApp {

    protected int width;
    protected int height;

    GraphicsContext g;
    public FXApp(GraphicsContext g){
        this.g = g;
        g.setStroke(Color.BLACK);
    }
    public void settings(){}
    public void setup(){}
    public void draw(){}
    public void mousePressed(){}
    public void keyPressed(){}
    public void mouseDragged(){}
    public void mouseReleased(){}

    protected void stroke(int grey){
        g.setStroke(Color.rgb(grey, grey, grey));
    }
    protected void stroke(int r, int g, int b){
        this.g.setStroke(Color.rgb(r,g,b, 1.0));
    }

    // environment
    // TODO

    // conversion
    // TODO

    // string functions
    // TODO

    // array functions
    // TODO

    // shape
    // TODO

    // 2d primitives
    // TODO
    protected void ellipse(float x, float y, float width, float height){
        g.fillArc(x,y,width, height,0, 360, ArcType.ROUND);
        g.strokeArc(x,y, width, height, 0, 360, ArcType.ROUND);
    }
    protected void line(float x, float y, float x2, float y2){g.strokeLine(x, y, x2, y2);}
    protected void rect(float x, float y, float width, float height){g.rect(x,y,width,height);}

    // curves
    // TODO

    // 3d primitives
    // TODO

    // attributes
    // TODO
    protected void strokeWeight(int w){g.setLineWidth(w);}

    // vertex
    // TODO

    // setting - colour
    protected void background(int grey){g.save();g.setFill(Color.gray(grey));g.fillRect(0,0,width,height);g.restore();}
    protected void background(int r, int gg, int b){g.save();g.setFill(Color.rgb(r,gg,b));g.fillRect(0,0,width,height);g.restore();}
    protected void fill(int grey){g.setFill(Color.rgb(grey, grey, grey));}
    protected void fill(int rr, int gg, int bb){g.setFill(Color.rgb(rr,gg,bb));}

    protected void size(int w, int h){width = w;height = h;}
}
