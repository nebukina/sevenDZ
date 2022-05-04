public class Plate {
    private int food;

    public Plate(int food){
        this.food = food;
    }

    public void info(){
        System.out.println("емкость: "+food);
    }

    public boolean decreaseFood(int n){
        if (food<n) {
            System.out.println("не хватает еды в тарелке(");
            return false;
        } else {
            food = food - n;
            return true;
        }
    }

    public boolean notHungry(int appetite){
        return appetite < food;
    }

    public void AddEat(int count){
        food+=count;
    }
}
