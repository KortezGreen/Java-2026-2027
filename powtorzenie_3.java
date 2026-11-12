//Stwórz klasę Point, reprezentującą punkt w przestrzeni 3D, z polami: x, y, z. Napisz konstruktor, który przyjmuje te trzy wartości i sprawdza, czy są one w zakresie od -100 do 100. Jeśli wartości nie są w tym zakresie, powinny być ustawione na najbliższą granicę.

public class Point {
    public int x;
    public int y;
    public int z;

    public Point(int x, int y, int z) {
        this.x = validate(x);
        this.y = validate(y);
        this.z = validate(z);
    }

    private int validate(int value) {
        if (value < -100) {
            return -100;
        }
        if (value > 100) {
            return 100;
        }
        return value;
    }
}

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(50, -150, 200);
        System.out.println(p1.x + " " + p1.y + " " + p1.z);

        Point p2 = new Point(-100, 0, 100);
        System.out.println(p2.x + " " + p2.y + " " + p2.z);
    }
}

/////// z seterami

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = validate(x);
        this.y = validate(y);
        this.z = validate(z);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = validate(x);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = validate(y);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = validate(z);
    }

    private int validate(int value) {
        if (value < -100) {
            return -100;
        }
        if (value > 100) {
            return 100;
        }
        return value;
    }
}

public class Main {

    public static void main(String[] args) {
        Point p = new Point(50, -150, 200);
        System.out.println(p.getX() + " " + p.getY() + " " + p.getZ());

        p.setX(-120);
        p.setY(40);
        p.setZ(300);
        System.out.println(p.getX() + " " + p.getY() + " " + p.getZ());
    }
}

////// oddaj toString

public class Point {
    private int x;
    private int y;
    private int z;

    public Point(int x, int y, int z) {
        this.x = validate(x);
        this.y = validate(y);
        this.z = validate(z);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = validate(x);
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = validate(y);
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = validate(z);
    }

    private int validate(int value) {
        if (value < -100) {
            return -100;
        }
        if (value > 100) {
            return 100;
        }
        return value;
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + ", z=" + z + '}';
    }
}

public class Main {

    public static void main(String[] args) {
        Point p = new Point(50, -150, 200);
        System.out.println(p);

        p.setX(-120);
        p.setY(40);
        p.setZ(300);
        System.out.println(p);
    }
}
