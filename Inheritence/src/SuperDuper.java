public class SuperDuper {

    public static void main(String[] args) {

        Cat myCat = new Cat(3, "Felix", "Fish");
        myCat.makenoise();
        myCat.eat();
        System.out.println(myCat.age + " " + myCat.name + " " + myCat.catFoodPreference);


        Dog myDog = new Dog(3, "Fido", "Bones");
        myDog.makenoise();
        myDog.eat();
        System.out.println(myDog.age + " " + myDog.name + " " + myDog.dogFoodPreference);
        myDog.guard();
        myDog.breed();


    }


}