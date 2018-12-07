package Homework7;

public class Plate {

    private int plateCapacity = 300;
    private int currentFoodQuantity;

    public Plate() {
        this.currentFoodQuantity = plateCapacity;
    }

    public Plate(int currentFoodQuantity) {
        if (currentFoodQuantity > plateCapacity) {
            throw new IllegalArgumentException("Тарелка не может вместить больше " + plateCapacity + " единиц еды.");
        } else {
            this.currentFoodQuantity = currentFoodQuantity;
        }
    }

    public void fillPlate() {
        currentFoodQuantity = plateCapacity;
    }

    public void decreaseFood(int n) {
        if (n > currentFoodQuantity) {
            currentFoodQuantity = 0;
        } else {
            currentFoodQuantity -= n;
        }
    }

    public void increaseFoor(int n) {
        if (n + currentFoodQuantity > plateCapacity) {
            currentFoodQuantity = plateCapacity;
        } else {
            currentFoodQuantity += n;
        }
    }

    public int getPlateCapacity() {
        return plateCapacity;
    }

    public void setPlateCapacity(int plateCapacity) {
        this.plateCapacity = plateCapacity;
    }

    public int getCurrentFoodQuantity() {
        return currentFoodQuantity;
    }

    public void setCurrentFoodQuantity(int currentFoodQuantity) {
        this.currentFoodQuantity = currentFoodQuantity;
    }
}
