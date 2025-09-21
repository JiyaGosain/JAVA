import java.util.Scanner;
class Box {
    float width;
    float height;
    float depth;

    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

    Box(float w, float h, float d) {
        width = w;
        height = h;
        depth = d;
    }

    // Copy constructor
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }

    float getWidth() 
    { return width; 
}
    float getHeight() { return height; }
    float getDepth() { return depth; }


    void setWidth(float w) { width = w; }
    void setHeight(float h) { height = h; }
    void setDepth(float d) { depth = d; }

    void displayVolume() {
        System.out.println("Volume of Box = " + (width * height * depth));
    }
}

class BoxWeight extends Box {
    float weight;

    BoxWeight() {
        super();
        weight = -1;
    }

    BoxWeight(float w, float h, float d, float m) 
    {
        super(w, h, d);
        weight = m;
    }

    BoxWeight(BoxWeight bw) 
    {
        super(bw); 
        weight = bw.weight;
    }

    float getWeight() { return weight; }

    void setWeight(float m) { weight = m; }

    
    void displayWeight() {
        System.out.println("Weight of Box = " + weight);
    }
}

public class DemoBoxWeight {
    public static void main(String[] args) {
        System.out.println("Jiya Gosain, 24csu313");
        BoxWeight bw1 = new BoxWeight(2, 3, 4, 10);
        bw1.displayVolume();
        bw1.displayWeight();

        BoxWeight bw2 = new BoxWeight(bw1);
        bw2.displayVolume();
        bw2.displayWeight();

        BoxWeight bw3 = new BoxWeight();
        bw3.setWidth(5);
        bw3.setHeight(5);
        bw3.setDepth(5);
        bw3.setWeight(20);
        bw3.displayVolume();
        bw3.displayWeight();
    }
}
