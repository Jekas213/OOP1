public class Print {
    public void printBestStudentOfFaculty(Gryffindor student1, Gryffindor student2) {
        if (student1.sumGryffindor() > student2.sumGryffindor()) {
            System.out.println(student1.getName() + " лучший Гриффиндорец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Гриффиндорец, чем " + student1.getName());
        }
        System.out.println();
    }

    public void printBestStudentOfFaculty(Slytherin student1, Slytherin student2) {
        if (student1.sumSlytherin() > student2.sumSlytherin()) {
            System.out.println(student1.getName() + " лучший Слизоринец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Слизоринец, чем " + student1.getName());
        }
        System.out.println();
    }

    public void printBestStudentOfFaculty(Ravenclaw student1, Ravenclaw student2) {
        if (student1.sumRavenclaw() > student2.sumRavenclaw()) {
            System.out.println(student1.getName() + " лучший Когтевранец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Когтевранец, чем " + student1.getName());
        }
        System.out.println();
    }

    public void printBestStudentOfFaculty(Hufflepuff student1, Hufflepuff student2) {
        if (student1.sumHufflepuff() > student2.sumHufflepuff()) {
            System.out.println(student1.getName() + " лучший Пуфендуец, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " лучший Пуфендуец, чем " + student1.getName());
        }
        System.out.println();
    }

    public void printBestStudent(Hogwarts student1, Hogwarts student2) {
        if (student1.sum() > student2.sum()) {
            System.out.println(student1.getName() + " обладает бОльшей мощностью магии, чем " + student2.getName());
        } else {
            System.out.println(student2.getName() + " обладает бОльшей мощностью магии, чем " + student1.getName());
        }
        System.out.println();
    }

    public void print(Hogwarts student) {
        System.out.println(student.toString());
        System.out.println();
    }
}
