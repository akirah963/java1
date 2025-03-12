
interface Drawable {
    void draw();
}


interface Colorable {
    void color();
}

class Shape implements Drawable, Colorable {
    @Override
    public void draw() {
        System.out.println("Drawing the shape.");
    }

    @Override
    public void color() {
        System.out.println("Coloring the shape.");
    }
}

public class Main3 {
    public static void main(String[] args) {
        Shape myShape = new Shape(); 
        myShape.draw();              
        myShape.color();           
    }
}