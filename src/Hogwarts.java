import java.sql.SQLOutput;

public class Hogwarts {
    private String name;
    private int powerOfMagik;
    private int distanceOfTransgression;

    public Hogwarts(String name, int powerOfMagik, int distanceOfTransgression) {
        this.powerOfMagik = powerOfMagik;
        this.distanceOfTransgression = distanceOfTransgression;
        this.name = name;
    }

    public int getPowerOfMagik() {
        return powerOfMagik;
    }

    public void setPowerOfMagik(int powerOfMagik) {
        this.powerOfMagik = powerOfMagik;
    }

    public int getDistanceOfTransgression() {
        return distanceOfTransgression;
    }

    public void setDistanceOfTransgression(int distanceOfTransgression) {
        this.distanceOfTransgression = distanceOfTransgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int sum(Hogwarts student) {
        return student.getPowerOfMagik() + student.getDistanceOfTransgression();
    }

}
