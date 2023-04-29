public class Jaeger {

    private String modelName;
    private String mark;
    private String origin;
    private String status;
    private float height;
    private float weight;
    private int strenght;
    private int armor;
    private int speed;

    public Jaeger() {}

    public Jaeger(String modelName, String mark, String origin, String status , float height, float weight, int strenght, int armor, int speed) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.strenght = strenght;
        this.armor = armor;
        this.speed = speed;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean drift() {
        return true;
    }

    public void move() {
        System.out.println("Идёт");
    }

    public String scanKaiju() {
        return "scanning";
    }

    public void useVortexCannon() {
        System.out.println("Activated");
    }

    public void attack() {
        System.out.println("Атака");
    }
}