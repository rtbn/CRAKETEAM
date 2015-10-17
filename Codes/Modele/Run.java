class C {
    private int i = 0;
    public C() {
        i = 1;
        f();
    }
    
    public void f() {
        System.out.println("i = " + i);
    }
}

class D extends C {
    private int j = 0;
    public D() {
        j = 1;
    }

    public void f() {
        super.f();
        System.out.println(" - j = " +j);
    }
}

class Run {
    public static void main(String[] args) {
        C c = new D();
        c.f();
    }
}