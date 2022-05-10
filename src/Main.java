public class Main {

    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Ирина")
                .setSurname("Иванова")
                .setAge(31)
                .setAddress("Иваново")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Ванюшка")
                .build();
        System.out.printf(" Персона: %n " + mom + "%n Есть сын: %n " + son + "%n");

        try {
            // Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

    }
}
