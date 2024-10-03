public class Cat {
    private String name;
    private int age;
    private int weight;
    private String color;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Error");
        }
    }

    void jump() {
        System.out.println(name +" is jumping");
    }
}
