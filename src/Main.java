
public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Мурка ", 3);
        cat1.setName("Зина");
        cat1.setAge(-1);

        Humster hums1 = new Humster("Васька",2,"Зеленый");
        hums1.setName("Коля");
        hums1.setColor("Черный");
        hums1.setWeight(-1);


        System.out.println(cat1.getAge());
        System.out.println(cat1.getName());

        System.out.println(hums1.getWeight());
        System.out.println(hums1.getName());
        System.out.println(hums1.getColor());

        cat1.jump();
        hums1.jump();

    }
}
