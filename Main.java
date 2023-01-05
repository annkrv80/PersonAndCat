public class Main {

    public static void main(String[] args) {

        Person anna = new Person("Anna");
        Person andrey = new Person("Andrey");
        Cat barsik = new Cat("Barsik", "Anna");
        Dog tuzik = new Dog("Tuzik", "Andrey");
        Fish fish = new Fish("Anna");
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

    }

}
