public class Dog extends Pets implements PetCallingPerson {
    private String petName;
    private String petVoice;

    public Dog(String petName, String petOwner) {
        this.petName = petName;
        this.petOwner = petOwner;

    }

    public String getPetName() {
        return petName;
    }

    public String getPetVoice() {
        return petVoice;
    }

    public void setPetVoice(String petVoice) {
        this.petVoice = petVoice;
    }

    @Override
    public String toString() {

        return this.petName;
    }

    @Override
    void eat() {
        System.out.println(this.petName + " грызет кость!");
    }

    @Override
    public void callPet(Person p) {
        System.out.println(p.getName() + " говорит " + p.getVoice());
        if (p.getName() == this.petOwner) {
            if (p.getVoice() == "Ко мне!") {
                System.out.println(this.petName + " бежит " + p.getName());
            } else {
                System.out.println(this.petName + "  делает вид что не понимает!");
            }
        } else {
            System.out.println(this.petName + "  слушает только хозяина!");
        }

    }

    @Override
    public void petCallingPerson(Person p) {
        if (this.petVoice == "gav-gav-gav") {
            p.feeding();
        }
        if (this.petVoice == "ppp-gav") {
            p.pet();
        }

    }
}
