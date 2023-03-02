public class Hufflepuff extends Hogwarts {
    private int industriousness;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, int powerOfMagik, int distanceOfTransgression, int industriousness, int loyalty, int honesty) {
        super(name, powerOfMagik, distanceOfTransgression);
        this.industriousness = industriousness;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() +
                ", Сила магии=" + getPowerOfMagik() +
                ", Трансгрессия=" + getDistanceOfTransgression() +
                ", трудолюбие=" + industriousness +
                ", Верность=" + loyalty +
                ", Честность=" + honesty;
    }

    public int sumHufflepuff() {
        return getIndustriousness() + getLoyalty() + getHonesty();
    }
}
