package HWS.homework3.ex2;

public class Runner {
    public static void main(String[] args) {
        FortuneTelling daisy = (name) -> {
            String strName = (String) name;
            return strName.length() % 2 == 0 ? "да" : "нет";
        };

        FortuneTelling grandma = (person) -> {
            Person p = (Person) person;
            return (p.age + p.height) > 210 ? "да" : "нет";
        };

        System.out.println(daisy.predict("Анна")); // да
        System.out.println(grandma.predict(new Person(25, 190))); // да
    }
}