package za.co.besolutions;

public class Floor {

    private double width;
    private double height;

    public Floor(double width, double height){
        this.height = height > 0 ? height : 0;
        this.width = width > 0 ? width : 0;
    }

    public double getArea(){
        return width * height;
    }

}
