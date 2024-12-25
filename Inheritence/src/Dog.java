public class Dog extends Animal {

    String dogFoodPreference;

    public Dog(int age, String name, String dogFoodPreference) {
        super(age, name);
        this.dogFoodPreference = dogFoodPreference;
    }

    public void makenoise() {
        super.makenoise();
        System.out.println("Woof woof woof!");

        super.doSomethingPrivate();
    }

    public void guard() {
        System.out.println("Guard dog");
    }

    public void breed() {
        System.out.println("Husky");
    }
}
