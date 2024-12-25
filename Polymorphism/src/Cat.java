public class Cat extends Animal {
    private String litterPreference;


    public void eat() {
        System.out.println("nom nom nom");
    }


    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        this.litterPreference = litterPreference;
    }
}
