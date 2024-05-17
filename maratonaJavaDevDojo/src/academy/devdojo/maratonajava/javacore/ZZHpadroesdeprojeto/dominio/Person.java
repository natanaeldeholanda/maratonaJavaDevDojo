package academy.devdojo.maratonajava.javacore.ZZHpadroesdeprojeto.dominio;


//PADRÃO DE PROJETO BUILDER
public class Person {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;


    private Person(String firstNome, String lastNome, String userName, String email) {
        this.firstName = firstNome;
        this.lastName = lastNome;
        this.userName = userName;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public String getFirsName() {
        return firstName;
    }

    public static final class PersonBuilder {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;

        public PersonBuilder() {
        }

        public static PersonBuilder builder() {
            return new PersonBuilder();
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Person build() {
            Person person = new Person(null, null, userName, email);
            person.lastName = this.lastName;
            person.firstName = this.firstName;
            return person;
        }

        public String getFirstName() {
            return firstName;
        }
    }
}