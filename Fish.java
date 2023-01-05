public class Fish extends Pets implements Swim {

    public Fish(String petOwent) {
        this.petOwner = petOwent;
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
