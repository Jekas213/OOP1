public class Slytherin extends Hogwarts {
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;

    public Slytherin(String name,
                     int powerOfMagik,
                     int distanceOfTransgression,
                     int trick,
                     int determination,
                     int ambition,
                     int resourcefulness,
                     int lustForPower) {
        super(name, powerOfMagik, distanceOfTransgression);
        this.trick = trick;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.lustForPower = lustForPower;
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() +
                ", Сила магии=" + getPowerOfMagik() +
                ", Трансгрессия=" + getDistanceOfTransgression() +
                ", Хитрость=" + trick +
                ", Решительность=" + determination +
                ", Амбициозность=" + ambition +
                ", Находчивость=" + resourcefulness +
                ", Жажда Власти=" + lustForPower;
    }

    public static int sumSlytherin(Slytherin student) {
        return student.getTrick() + student.getDetermination() + student.getAmbition() + student.getResourcefulness() + student.getLustForPower();
    }
}
