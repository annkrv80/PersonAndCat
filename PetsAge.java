import java.util.Comparator;

public class PetsAge implements Comparator<Pets>{

    @Override
    public int compare(Pets o1, Pets o2) { 
        return o1.getPetAge()-o2.getPetAge();
    }

    
}
