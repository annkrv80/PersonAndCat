public class Action {

    String action;

    public String callTheCat(Person p, Cat c) {
        System.out.println(p.getName() + " говорит " + p.getVoice());
        if (p.getVoice() == "kis-kis-kis") {
            action = c.getName() + " бежит " + p.getName();
        } else {
            action = c.getName() + " делает вид что не понимает!";
        }
        return action;
    }

    public String petTheCat(Person p, Cat c) {
        System.out.println(c.getName() + " ластиться " + c.getVoice());
        if (c.getVoice() == "mur-mur-mur") {
            action = p.getName() + " гладит " + c.getName();
        } else {
            action = c.getName() + "что тебя?";
        }
        return action;
    }

    public String feedTheCat(Person p, Cat c) {
        System.out.println(c.getName() + " идет к миске и орет " + c.getVoice());
        if (c.getVoice() == "mau-mau-mau") {
            action = p.getName() + " кормит " + c.getName();
        } else {
            action = c.getName() + " что тебя?";
        }
        return action;

    }

}