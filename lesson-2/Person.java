public class Person {
    String sex;
    String name;
    double weight;
    int age;

    public Person() {
        this.sex = "male";
        this.name = "Alex";
        this.weight = 84.5;
        this.age = 33;
    }

    public void move() {
        System.out.println("Иду");
    }

    public void sit() {
        System.out.println("Сижу ");
    }

    public void run() {
        System.out.println("Бегу");
    }

    public void talk() {
        System.out.println("Говорю");
    }

    public void studyJava() {
        System.out.println("Изучаю Java");
    }
}