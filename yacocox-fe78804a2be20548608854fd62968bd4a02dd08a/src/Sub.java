class Super {
    static int a = 1;

    public static Integer getLenght1() {
        return new Integer(88);
    }

    static void outerMethod1() {
        System.out.println("outer");
    }

    public Integer getLenght() {
        return new Integer(4);
    }

    static class Inner {
        int s = 1;
        int f = 1;

        String innerMethod() {
            System.out.println();
            return "a";
        }

        void innerMethod1() {
            System.out.println(a);
        }
    }
}

public class Sub extends Super {
    public static Integer getLenght1() {
        return new Integer(9);
    }

    public static void main(String[] args) {
        Inner s = new Inner();
        int[] ia = {2, 3, 4, 5};
        int ia1[][] = {{4, 7, 4}, {4, 5, 6}};
        System.out.println(ia);
        System.out.println(ia1);
        Super sooper = new Super();
        Sub sub = new Sub();
        System.out.println(sooper.getLenght().toString() + "," +
                sub.getLenght1().toString());
    }

    public Integer getLenght() {
        return new Integer(5);
    }
}