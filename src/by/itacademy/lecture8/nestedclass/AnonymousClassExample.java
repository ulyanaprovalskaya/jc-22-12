package by.itacademy.lecture8.nestedclass;

public class AnonymousClassExample {

    public static void main(String[] args) {
        Greeting englishGreeting = new EnglishGreeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello!");
            }
        };

        Greeting belarussianGreeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Прывiтанне!");
            }
        };

        Greeting russianGreeting = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Привет!");
            }
        };

        englishGreeting.sayHello();
        belarussianGreeting.sayHello();
        russianGreeting.sayHello();
    }
}
