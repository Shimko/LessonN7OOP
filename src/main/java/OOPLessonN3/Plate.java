package OOPLessonN3;

public class Plate {
    private static int food;
    public Plate(int food) {
        this.food = food;
    }
    public void infoFood(){
        System.out.println("Plate: "+ food);
    }
    public static int getFood() {
        return food;
    }
    public static void setFood(int food) {
        Plate.food = food;
    }
}
