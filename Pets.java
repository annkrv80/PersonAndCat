public abstract class Pets implements Comparable<Pets>{
    protected String petOwner;
    protected int petAge;

    public String getPetOwner() {
        return petOwner;
    }

    public void setPetOwner(String petOwner) {
        this.petOwner = petOwner;
    }

   public int getPetAge() {
       return petAge;
   }

    abstract void eat();

    @Override
    public int compareTo(Pets o) {
        
        return this.petAge-o.petAge;
    }
    
}    
