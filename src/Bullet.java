public class Bullet {

    private int x;
    private int y;

    private int dx;
    private int dy;

    private int speed = 10;

    public Bullet(int x, int y, int dx, int dy) {
        this.x = x;
        this.y = y;
        this.dx = dx;
        this.dy = dy;
    }

    public void move() {
        x += dx * speed;
        y += dy * speed;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x){ this.x = x; }

    public void setY(int y){ this.y = y; }

    public void setDX(int dX){ this.dx = dX;}

    public void setDY(int dY){ this.dy = dY; }
}
