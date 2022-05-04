public class Cat {
    private String name;
    private int appetite;
    private boolean full = false;

    public Cat(String name, int appetite) {
        this.appetite = appetite;
        this.name = name;
    }

    public void info() {
        System.out.println(name + " " + appetite + " " + full);
    }

    public void eat(Plate p) {
        if (p.decreaseFood(appetite)){
            full = true;
        }
    }


}
