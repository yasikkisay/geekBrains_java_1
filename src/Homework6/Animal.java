package Homework6;

public abstract class Animal {

    private float runLimit;
    private float jumpLimit;

    public enum AnimalType {
        DOMESTIC("Домашнее"),
        WILD("Дикое");

        String animalTypeName;
        AnimalType(String animalTypeName) {
            this.animalTypeName = animalTypeName;
        }
    }

    public Animal(float runLimit, float jumpLimit) {
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
    }

    public abstract String run(float distance);
    public abstract String jump(float height);

    public float getRunLimit() {
        return runLimit;
    }

    public void setRunLimit(float runLimit) {
        this.runLimit = runLimit;
    }

    public float getJumpLimit() {
        return jumpLimit;
    }

    public void setJumpLimit(float jumpLimit) {
        this.jumpLimit = jumpLimit;
    }
}
