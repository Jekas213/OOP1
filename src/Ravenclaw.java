public class Ravenclaw extends Hogwarts {
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;

    public Ravenclaw(String name, int powerOfMagik, int distanceOfTransgression, int mind, int wisdom, int wit, int creativity) {
        super(name, powerOfMagik, distanceOfTransgression);
        this.mind = mind;
        this.wisdom = wisdom;
        this.wit = wit;
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Имя: " + getName() +
                ", Сила магии=" + getPowerOfMagik() +
                ", Трансгрессия=" + getDistanceOfTransgression() +
                ", Ум=" + mind +
                ", Мудрость=" + wisdom +
                ", Остроумие=" + wit +
                ", Творчество=" + creativity;
    }

    public static int sumRavenclaw(Ravenclaw student) {
        return student.getMind() + student.getWisdom() + student.getCreativity() + student.getWit();
    }
}
