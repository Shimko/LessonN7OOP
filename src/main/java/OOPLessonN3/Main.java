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
            if( Plate.food >= catArray[i].appetite) {
                catArray[i].hunger = true;
                System.out.println( " Koт " + catArray[i].name + " сегодня не останется голодным ");
                if (Plate.food - catArray[i].appetite >= 0) {
                    Plate.food -= catArray[i].appetite;
                    System.out.println(" Koт " + catArray[i].name + " съел из тарелки " + catArray[i].appetite + " единиц еды");
                    int b = random.nextInt(30); ;
                    addFood(b);
                    System.out.println(" В тарелке осталось " + Plate.food + " единиц еды");
                }

            }
            else {
                System.out.println("Похоже кот " + catArray[i].name + " сегодня останется голодным");
            }
        }
    }

    public static void addFood(int n) {
        Plate.food +=n;
        System.out.println(" Хозяин добавил в тарелку "+ n + " единиц еды");
    }
}

