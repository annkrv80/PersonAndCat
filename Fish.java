public class Fish extends Pets implements Swim {

    public Fish(int petAge, String petOwent) {
        this.petOwner = petOwent;
        this.petAge=petAge;
    }

    @Override
    public String toString() {

        return "рыбки " + this.petOwner;
    }

    @Override
    void eat() {
        System.out.println("Рыбки едят корм!");
    }

    @Override
    public void swimming() {
        System.out.println(this.petOwner + " стучит по аквариуму");
        System.out.println("Рыбки преплывают!");

    }
}
