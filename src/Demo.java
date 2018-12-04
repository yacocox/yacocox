class DemoFather {
    private static int x = find1();

    static {
        System.out.println(3);
    }

    private int y = method1();

    {
        System.out.println(2);
    }

    public DemoFather() {
        System.out.println(1);
    }

    public static int find1() {
        System.out.println(4);
        return 0;
    }

    public int method1() {
        System.out.println(5);
        return 0;
    }
}

public class Demo {
    private static int x = find1();

    static {
        System.out.println(8);
    }

    private int y = method1();

    {
        System.out.println(7);
    }

    public Demo() {
        System.out.println(6);
    }

    public static int find1() {
        System.out.println(9);
        return 0;
    }

    public static void main(String[] args) {
//        Demo demo1 = new Demo();
//        System.out.println();
//        inner s = new inner();
    }

    public int method1() {
        System.out.println(10);
        return 0;
    }

    static class inner extends DemoFather {
        public static int x = find1();
        private int y = method1();

        public inner() {
            System.out.println("innerdddddddd");
        }
    }
}
