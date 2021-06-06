package OOPLessonN3;

public class Plate {
    public static int food;

    public Plate(int food) {
        if (food >=0){
        this.food = food;
        }

    }
    public void infoFood(){
        System.out.println("Plate: "+ food);
    }

}
