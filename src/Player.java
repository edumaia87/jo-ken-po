public class Player {

    private String name;
    private Integer score;

    public Player(String name) {
        this.name = name;
        this.score = 0;
    }

    public void incrementScore() {
        setScore(getScore() + 1);
    }

    public String getName() {
        return this.name;
    }

    public String setName(String name) {
        this.name = name;
        return name;
    }

    public Integer getScore() {
        return this.score;
    }

    public Integer setScore(Integer score) {
        this.score = score;
        return score;
    }
}
