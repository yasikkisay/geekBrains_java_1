package Homework7;

public class Cat {

    private int currentFed;
    private int fedLimit;
    private String name;
    private CatHungerType hungerType;

    public enum CatHungerType {
        HUNGRY("голодный"),
        WELL_FED("сытый");

        String catHungerType;
        CatHungerType(String catHungerType) {
            this.catHungerType = catHungerType;
        }
    }

    public Cat(int fedLimit, String name) {
        this.fedLimit = fedLimit;
        this.name = name;
        this.currentFed = 0;
    }

    public void eat(Plate plate, int n) {
        if (plate.getCurrentFoodQuantity() < n) {
            int foodAmount = plate.getCurrentFoodQuantity();
            plate.decreaseFood(plate.getCurrentFoodQuantity());
            currentFed += foodAmount;
        } else {
            plate.decreaseFood(n);
            currentFed =+ n;
        }
        isWellFed();
    }

    public boolean isWellFed() {
        if (currentFed >= fedLimit) {
            this.setHungerType(CatHungerType.WELL_FED);
        } else {
            this.setHungerType(CatHungerType.HUNGRY);
        }
        return currentFed >= fedLimit;
    }

    public int getFedLimit() {
        return fedLimit;
    }

    public void setFedLimit(int fedLimit) {
        this.fedLimit = fedLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHungerType() {
        return hungerType.catHungerType;
    }

    public void setHungerType(CatHungerType catHungerType) {
        this.hungerType = catHungerType;
    }

    public int getCurrentFed() {
        return currentFed;
    }
}
