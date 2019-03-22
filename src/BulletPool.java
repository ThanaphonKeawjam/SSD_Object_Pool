import java.util.ArrayList;
import java.util.List;

public class BulletPool{

    private int size = 10;

    private static BulletPool instance;
    private List<Bullet> list;

    public BulletPool(){
        list = new ArrayList<>();
        for(int i=0; i<size; i++){
            list.add(new Bullet(0, 0, 0 ,0));;
        }
    }

    public static BulletPool getInstance(){
        if(instance == null) instance = new BulletPool();
        return instance;
    }

    public void setSize(int s){ this.size *= s; }

    public Bullet getBullet(int x, int y, int dX, int dY){
        if(list.isEmpty()){
            setSize(2);
            for (int i=0; i<size; i++) list.add(new Bullet(0, 0, 0, 0));
        }

        Bullet b = list.remove(0);

        b.setX(x);
        b.setY(y);
        b.setDX(dX);
        b.setDY(dY);

        return b;
    }

    public void releaseBullet(Bullet bullet){
        list.add(bullet);
    }

}