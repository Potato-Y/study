public class main {
    public static void main(String args[]) {
        Point p = new Point();
        p.set(1, 2);
        p.showPoint();

        System.out.println("---");
        ColorPoint cp = new ColorPoint();
        cp.set(3, 4);
        cp.setColor("red");
        cp.showColorPoint();

        System.out.println("---");
        ColorPoint2 cp2 = new ColorPoint2();
        cp2.set(5, 6);
        cp2.setColor("Red");
        cp2.setBackgroundColor("Black");
        cp2.showAllColor();
    }
}

class Point {
    private int x, y;

    public void set(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void showPoint() {
        System.out.println("(" + x + ", " + y + ")");
    }
}

class ColorPoint extends Point { // Point를 상속받은 ColorPoint 선언
    private String color; //점의 색

    public void setColor(String color) {
        this.color = color;
    }

    public void showColorPoint() {
        System.out.print(color + " ");
        showPoint();
    }
}

class ColorPoint2 extends ColorPoint {
    private String backgroundColor;

    public void setBackgroundColor(String backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    public void showAllColor() {
        System.out.print(backgroundColor + " ");
        showColorPoint();
    }
}