interface sss {
    static final int x = 0;

    public abstract void find2();

}

public class abstrct extends test implements sss {

    @Override
    public void find() {

    }

    @Override
    public void find2() {

    }
}

abstract class test {
    static final int y = 1;
    int x = 0;

    public abstract void find();

    public void find12(int x) {

    }
}
