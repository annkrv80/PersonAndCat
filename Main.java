public class Main {

    public static void main(String[] args) {

        Person anna = new Person("Anna");
        Cat barsik = new Cat("Barsik", "Anna");
        anna.setVoice("kis-kis-kis");
        System.out.println(new Action().callTheCat(anna, barsik));
        barsik.setVoice("mur-mur-mur");
        System.out.println(new Action().petTheCat(anna, barsik));
        barsik.setVoice("mau-mau-mau");
        System.out.println(new Action().feedTheCat(anna, barsik));

    }

}
