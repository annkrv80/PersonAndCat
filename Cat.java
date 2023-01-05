public class Cat extends Pets implements PetCallingPerson {
    private String petName;
    private String petVoice;

    public Cat(String petName, String petOwner) {
        this.petName = petName;
        this.petOwner = petOwner;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetVoice(String petVoice) {
        this.petVoice = petVoice;
    }

    public String getPetVoice() {
        return petVoice;
    }

    @Override
    public String toString() {

        return this.petName;
    }

    @Override
    void eat() {
        System.out.println(this.petName + " пьет молоко!");

    }

    @Override
    public void callPet(Person p) {
        System.out.println(p.getName() + " говорит " + p.getVoice());
        if (p.getVoice() == "kis-kis-kis") {
            System.out.println(this.petName + " бежит " + p.getName());
        } else {
            System.out.println(this.petName + "  делает вид что не понимает!");
        }
    }

    @Override
    public void petCallingPerson(Person p) {
        if (this.petVoice == "myau-myau") {
            p.feeding();
        }
        if (this.petVoice == "mur-mur-mur") {
            p.pet();
        }
    }
}