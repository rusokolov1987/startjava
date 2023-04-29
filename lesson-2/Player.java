public class Player {
    private String name;
    private String question;
    private int number;

    public Player(String name) {
        this.name = name;
        question = "да";
    }

    public String getName() {
        return name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getQuestion() {
        return question;
    }
}