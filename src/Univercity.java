import java.util.ArrayList;

public abstract class Univercity implements Doctor{
    private ArrayList<Bimar> bimar =new ArrayList<>();

    public abstract void accessAll(int code);
    public abstract void accessSome(int code);
}
