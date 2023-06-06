package PractiseOnObject;

public class Point {
    private  int x,y;
    Point(int x, int y){
        this.x =x;
        this.y =y;
    }

    @Override
    public String toString() {
        return "[" +this.x + " , "+y+"]";
    }
    @Override
    public int hashCode() {
        return this.x + this.y;
    }

    @Override
    public boolean equals(Object obj) {
        Point other = (Point)obj;
        if(this.x == other.x && this.y == other.y){
            return  true;
        }
        return  false;
    }
}
