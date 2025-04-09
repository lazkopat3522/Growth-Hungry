package Zoo;

public class Dog {
    String name;
    public Dog(String name) {
        this.name = name;
    }
    public void bark() {
        System.out.println(this.name+" barked");
    }
}
