public class Person {

    private String name;
    private String voice;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    @Override
    public String toString() {

        return this.name;
    }

    public void feeding() {
        System.out.println(this.name + " кормит питомца!");
    }

    public void pet() {
        System.out.println(this.name + " гладит питомца!");
    }
}