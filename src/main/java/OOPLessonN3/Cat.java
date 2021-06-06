package OOPLessonN3;

public class Cat {
    private   String name;
    private int appetite;
    private boolean hunger;

    public Cat(String name, int appetite, boolean hunger) {
        this.name = name;
        this.appetite = appetite;
        this.hunger = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean getHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }
}
