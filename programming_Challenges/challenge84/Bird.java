package programming_Challenges.challenge84;

public abstract class Bird implements Flyables {
    private final String breed;

    public Bird(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }
}
