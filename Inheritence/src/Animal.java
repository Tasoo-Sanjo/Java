public class Animal {

    int age;
    String name;
     public Animal() {}

    public Animal(int age, String name) {
         this.age = age;
         this.name = name;
    }

    public void makenoise() {
        System.out.println("The animal makes a noise");
    }

    public void eat() {
         System.out.println("Munch Munch");
    }

    protected void doSomethingPrivate() {
         System.out.println("I am private");
    }
}
