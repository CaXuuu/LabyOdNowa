
public class Main {
    public static void main(String[] args) {
Point p = new Point(2,3);
        System.out.println(p.toString());
        System.out.println(p.toSvg());
SvgScene scene = new SvgScene();
        Polygon p1 = new Polygon(new Point[]{
                new Point(2.0, 6.5),
                new Point(40.0, 50.5),
                new Point(80.0, 99.5)
        });
        Polygon p2 = new Polygon(new Point[]{
                new Point(32.0, 53.5),
                new Point(32.0, 50.5),
                new Point(39.0, 55)
        });
        Polygon p3 = new Polygon(new Point[]{
                new Point(4.0, 8.5),
                new Point(10, 20),
                new Point(25, 45)
        });
        scene.addPolygon(p1);
        scene.addPolygon(p2);
        scene.addPolygon(p3);
        System.out.println(scene);
        System.out.println(scene.toSvg());


    }
}