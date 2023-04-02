package annotationAndExeption.immutablePerson;

import java.lang.reflect.Field;

public class ImmutablePerson {
    @ReadOnly
    private final String name;
    @ReadOnly
    private final int age;

    private String city;

    public ImmutablePerson(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public static void isFieldImmutable() {
        Field[] fields = ImmutablePerson.class.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAccessible() || java.lang.reflect.Modifier.isFinal(field.getModifiers())) {
                System.out.println(field.getName() + " is immutable");
            } else {
                System.out.println(field.getName() + " is muttable");
            }
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}
