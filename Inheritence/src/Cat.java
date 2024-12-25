public class Cat extends Animal {

    String catFoodPreference;

    public Cat(int age, String name, String catFoodPreference) {
        super(age, name);
        this.catFoodPreference = catFoodPreference;
    }

    public void makenoise() {
        super.makenoise();
        System.out.println("Meow meow meow!");

        super.doSomethingPrivate();
    }


}
