package test;

public class Point3D extends Point {
    public int z = 0;

    public Point3D() {
        this(100,200,300);
    }

    public Point3D( int x, int y, int z) {
        super(x,y);
        this.z = z;

    }
}
