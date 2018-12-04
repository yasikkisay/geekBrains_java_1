package Homework6;

import java.text.MessageFormat;

public class Dog extends Animal {

    private final String TYPE = "Собака";
    private float swimLimit;

    public Dog(float runLimit, float jumpLimit, float swimLimit) {
        super(runLimit, jumpLimit);
        setSwimLimit(swimLimit);
    }

    @Override
    public String run(float distance) {
        if (distance <= getRunLimit()) {
            return MessageFormat.format("{0} пробежала {1} метров.", TYPE, distance);
        } else {
            return MessageFormat.format("{0} не может пробежать более {1} метров.", TYPE, getRunLimit());
        }
    }

    public String swim(float distance) {
        if (distance <= getSwimLimit()) {
            return MessageFormat.format("{0} проплыла {1} метров.", TYPE, distance);
        } else {
            return MessageFormat.format("{0} не может проплыть более {1} метров.", TYPE, getSwimLimit());
        }
    }

    @Override
    public String jump(float height) {
        if (height <= getRunLimit()) {
            return MessageFormat.format("{0} прыгнуда на {1} метров.", TYPE, height);
        } else {
            return MessageFormat.format("{0} не может прыгнуть на более чем {1} метров.", TYPE, getRunLimit());
        }
    }

    public float getSwimLimit() {
        return swimLimit;
    }

    public void setSwimLimit(float swimLimit) {
        this.swimLimit = swimLimit;
    }
}
