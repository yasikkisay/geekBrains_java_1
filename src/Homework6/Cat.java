package Homework6;

import java.text.MessageFormat;

public class Cat extends Animal {

    private final String TYPE = "Кот";
    private String domesticatedType;

    public Cat(float runLimit, float jumpLimit) {
        super(runLimit, jumpLimit);
    }


    @Override
    public String run(float distance) {
        if (distance <= getRunLimit()) {
            return MessageFormat.format("{0} пробежал {1} метров.", TYPE, distance);
        } else {
         return MessageFormat.format("{0} не может пробежать более {1} метров.", TYPE, getRunLimit());
        }
    }

    @Override
    public String jump(float height) {
        if (height <= getJumpLimit()) {
            return MessageFormat.format("{0} прыгнул на {1} метров.", TYPE, height);
        } else {
            return MessageFormat.format("{0} не может прыгнуть более чем на {1} метров.", TYPE, getJumpLimit());
        }
    }

    public String getDomesticatedType() {
        return domesticatedType;
    }

    public void setDomesticatedType(String domesticatedType) {
        this.domesticatedType = domesticatedType;
    }
}
