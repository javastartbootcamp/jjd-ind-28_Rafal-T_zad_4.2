package pl.javastart.task;

public class Person {
    private final String nickname;
    private final String name;
    private final String surname;
    private final String email;

    public Person(String nickname, String name, String surname, String email) {
        this.nickname = nickname;
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }
}
