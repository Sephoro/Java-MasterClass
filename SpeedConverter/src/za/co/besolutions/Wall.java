package za.co.besolutions;

public class Wall {

    private double height;
    private double width;

    public Wall(){
        this(0.0d, 0.0d);
    }
    public Wall(double height, double width){
        this.height = height > 0 ? height : 0;
        this.width = width > 0 ? width : 0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height > 0 ? height : 0;
    }

    public double getWidth() {
        return width;
    }

    public double getArea(){
        return width * height;
    }

    public void setWidth(double width) {
        this.width = width > 0 ? width : 0;
    }
}
