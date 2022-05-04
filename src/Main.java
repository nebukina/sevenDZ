public class Main {
    public static void main(String[] args){
        Cat cat1 = new Cat("Барс",10);
        Cat[] Cats = {
                new Cat("Мурзик", 15),
                new Cat("Пушок", 25),
                new Cat("Рыжик", 5),
        };
        Plate plate1 = new Plate(50);

        cat1.info();
        plate1.info();
        cat1.eat(plate1);
        cat1.info();

        plate1.AddEat(15);

        for (int i=0; i< Cats.length;i++) {
            Cats[i].eat(plate1);
            Cats[i].info();
        }
    }

}
