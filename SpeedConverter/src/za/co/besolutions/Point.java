package za.co.besolutions;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public  Point(){
        this(0,0);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(){
       return distance(new Point());
    }

    public  double distance(int x, int y){
        return distance(new Point(x, y));
    }

    public double distance(Point A){
        return Math.sqrt(Math.pow(this.getX() - A.getX(),2) + Math.pow(this.getY() - A.getY(),2));
    }

}
