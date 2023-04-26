public class WolfTest {
    public static void main(String[] args) {
        Wolf wolf = new Wolf();
        wolf.sex = "самец";
        wolf.name = "Роан";
        wolf.weight = 24.3;
        wolf.age = 2;
        wolf.color = "серый";
        System.out.println("Пол волка: " + wolf.sex + "\nКличка: " + wolf.name + "\nВозраст: " + 
            wolf.age + "\nВес: " + wolf.weight + "\nЦвет: " + wolf.color);
        wolf.move();
        wolf.sit();
        wolf.run();
        wolf.howl();
        wolf.hunt();
    }
}