public class Gryffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;

    public Gryffindor(String name, int powerOfMagik, int distanceOfTransgression, int nobility, int honor, int bravery) {
        super(name, powerOfMagik, distanceOfTransgression);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }

    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() +
                ", Сила магии=" + getPowerOfMagik() +
                ", Трансгрессия=" + getDistanceOfTransgression() +
                ", Благородство=" + nobility +
                ", Честь=" + honor +
                ", Храбрость=" + bravery;
    }

    public static int sumGryffindor(Gryffindor student) {
        return student.getNobility() + student.getHonor() + student.getBravery();
    }
}
