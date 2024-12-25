public class Main {

    public static void main(String[] args) {

        Car myCar = new Car("Chevrolet", "Camaro", 2021);

        myCar.setYear(2024);
        myCar.setMake("Ferrari");
        myCar.setModel("LA Ferarri");

        System.out.println(myCar.getMake());
        System.out.println(myCar.getModel());
        System.out.println(myCar.getYear());


    }
}