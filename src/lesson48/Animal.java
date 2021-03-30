package lesson48;

public enum Animal {
    DOG("Собака"), CAT("Кошка"), FROG("Лягушка");

    private String transletion;

    Animal (String transletion) {
        this.transletion = transletion;
    }

    public String getTransletion() {
        return "Перевод на русский язык: " + transletion;
    }
}
