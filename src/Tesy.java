public class Tesy {
    static {
        System.out.println("a静态块");
    }

    {
        System.out.println("a构造块");
    }

    /**
     * private static int num = 0;
     * public Tesy(){
     * num ++;
     * System.out.println("这是第"+ num +"个产生对象");
     * }
     */
    public Tesy() {
        System.out.println("a构造方法");
    }
}

class demo {
    public static void main(String arg[]) {
        new Tesy();
        new Tesy();
        new Tesy();
        new Tesy();
        new Tesy();
    }
}
