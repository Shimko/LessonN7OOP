package OOPLessonN3;

import java.util.Random;

public class Main {
    public  static Random random = new Random();
    public static void main(String[] args) {
        Cat [] catArray = {new Cat("Tom",random.nextInt(50), false),
                new Cat("Леопольд",random.nextInt(50), false),
                new Cat("Пушок",random.nextInt(50), false),
                new Cat("Матроскин",random.nextInt(50), false)};
        Plate plate = new Plate(60);
        plate.infoFood();
        catEat(catArray);
        plate.infoFood();
    }
    public static void catEat(Cat [] catArray) {
        for (int i = 0; i < catArray.length; i++) {
            if( Plate.getFood() >= catArray[i].getAppetite()) {
                catArray[i].setHunger(true);
                System.out.println( " Koт " + catArray[i].getName() + " сегодня не останется голодным ");
                if (Plate.getFood() - catArray[i].getAppetite() >= 0) {
                    Plate.setFood(- catArray[i].getAppetite());
                    System.out.println(" Koт " + catArray[i].getName() + " съел из тарелки " + catArray[i].getAppetite() + " единиц еды");
                    int b = random.nextInt(30); ;
                    addFood(b);
                    System.out.println(" В тарелке осталось " + Plate.getFood() + " единиц еды");
                }
            }
            else {
                catArray[i].setHunger(false);
                System.out.println("Похоже кот " + catArray[i].getName() + " сегодня останется голодным");
            }
        }
    }
    public static void addFood(int n) {
        Plate.setFood(+n);
        System.out.println(" Хозяин добавил в тарелку "+ n + " единиц еды");
    }
}

