import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        Person anna = new Person("Anna");
        Person andrey = new Person("Andrey");
        Cat barsik = new Cat("Barsik",8, "Anna");
        Dog tuzik = new Dog("Tuzik",5, "Andrey");
        Fish fish = new Fish(1,"Anna");
        anna.setVoice("kis-kis-kis");
        barsik.callPet(anna);
        barsik.setPetVoice("myau-myau");
        barsik.petCallingPerson(anna);
        barsik.eat();
        barsik.setPetVoice("mur-mur-mur");
        barsik.petCallingPerson(anna);
        anna.setVoice("Ко мне!");
        andrey.setVoice("Ко мне!");
        tuzik.callPet(anna);
        tuzik.callPet(andrey);
        tuzik.setPetVoice("gav-gav-gav");
        tuzik.petCallingPerson(andrey);
        tuzik.eat();
        tuzik.setPetVoice("ppp-gav");
        tuzik.petCallingPerson(andrey);
        fish.swimming();
        fish.eat();

        ArrayList<Pets> pets=new ArrayList<>();
        pets.add(tuzik);
        pets.add(barsik);
        pets.add(fish);
        Collections.sort(pets, new PetsAge());
        System.out.println(pets);

        if(tuzik.compareTo(barsik)>0){
            System.out.println(tuzik + "  старше  " + barsik);
        }else{
            System.out.println(barsik + "  старше  " + tuzik);
        }
    }

}
