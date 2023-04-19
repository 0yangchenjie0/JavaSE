package method;

class Person {
    String name;
    int money;
}

class Client {
    public static void main(String[] args) {
        // Create a person named Bob and he has no money.
        Person person = new Person();
        person.name = "Bob";
        person.money = 0;
        // Check the person, if he has no money, set it as null
        check(person);
        // If the person turned to null, print he has no money, otherwise print he's rich
        if (person == null) {
            System.out.println(person.name + " has no money.");
        } else {
            System.out.println(person.name + " is rich.");
        }
    }

    private static void check(Person person) {
        if (person.money <= 0) {
            person = null;
        }
    }

}