public class Polymorphism {

    public static void main(String[] args) {

        Animal myAnimal = new Animal();
        myAnimal.eat();

        Dog myDog = new Dog();
        myDog.eat(5);
        myDog.eat();

        Cat myCat = new Cat();
        myCat.eat();
    }
}