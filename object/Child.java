public class Child extends Parent {

    @Override
    public void a() {
        System.out.println("Child : a");
        super.a();
    }
    
    public void b() {
        System.out.println("Child : b");
    }
}
