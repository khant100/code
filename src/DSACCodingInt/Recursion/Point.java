package DSACCodingInt.Recursion;

public class Point {

    int x;
    int y;

    @Override
    public int hashCode() {
        return this.toString().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Point && ((Point) obj).x==x&&((Point) obj).y==y){
            return true;
        }else {
            return false;
        }
    }


    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ')';
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
