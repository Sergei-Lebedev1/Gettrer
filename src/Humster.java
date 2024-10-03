//Упр. Создать класс Хомяк. У хомяка должны быть характеристики
// (приватные поля) имя, вес и цвет.
//Хомяк должен уметь сообщать данные о себе (метод).
//У класса Хомяк должен быть конструктор, который принимает 3 поля.
//Создать геттеры и сеттеры на каждое поле.
//Мы не должны уметь присваивать хомяку отрицательный вес.
public class Humster {
    private String name;
    private int weight;
    private String color;

    public Humster(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        if (weight >= 0) {
            this.weight = weight;
        } else {
            System.out.println("Error");
        }

    }

    public void setColor(String color) {
        this.color = color;
    }

    void jump() {
        System.out.println(name + " is jumping");
    }
}




