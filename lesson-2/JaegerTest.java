public class JaegerTest {
    public static void main(String[] args) {
        System.out.println("Gipsy Danger:");
        Jaeger gipsyDanger = new Jaeger("Gipsy Danger", "Mark-3", "USA", "Destroyed", 79.25f, 1.98f, 8, 6, 7);
        System.out.println("Jaeger nameModel = " + gipsyDanger.getModelName() +
                "\nmark = " + gipsyDanger.getMark() + "\norigin = " + gipsyDanger.getOrigin() +
                "\nstatus = " + gipsyDanger.getStatus() + "\nheight = " + gipsyDanger.getHeight() +
                "\nweight = " + gipsyDanger.getWeight() + "\nstrenght = " + gipsyDanger.getStrenght() +
                "\narmor = " + gipsyDanger.getArmor() + "\nspeed = " + gipsyDanger.getSpeed());

        System.out.println("\nStriker Eureka:");
        Jaeger strikerEureka = new Jaeger();
        strikerEureka.setModelName("Striker Eureka");
        strikerEureka.setMark("Mark-5");
        strikerEureka.setOrigin("Australia");
        strikerEureka.setStatus("Destroyed");
        strikerEureka.setHeight(76.2f);
        strikerEureka.setWeight(1.85f);
        strikerEureka.setStrenght(10);
        strikerEureka.setArmor(9);
        strikerEureka.setSpeed(10);
        System.out.println("Jaeger nameModel = " + strikerEureka.getModelName() +
                "\nmark = " + strikerEureka.getMark() + "\norigin = " + strikerEureka.getOrigin() +
                "\nstatus = " + strikerEureka.getStatus() + "\nheight = " + strikerEureka.getHeight() +
                "\nweight = " + strikerEureka.getWeight() + "\nstrenght = " + strikerEureka.getStrenght() +
                "\narmor = " + strikerEureka.getArmor() + "\nspeed = " + strikerEureka.getSpeed());
    }
}