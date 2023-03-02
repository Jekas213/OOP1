
public class Main {
    public static void main(String[] args) {
        Print print = new Print();

        Gryffindor harry = new Gryffindor("Гарри Поттер", 80, 50, 60, 55, 80);
        Gryffindor hermione = new Gryffindor("Гермиона Грейнджер", 100, 60, 55, 60, 85);
        Gryffindor ron = new Gryffindor("Рон Уизли", 45, 40, 40, 50, 70);

        Slytherin draco = new Slytherin("Драко Малфой", 60, 50, 60, 50, 90, 60, 100);
        Slytherin graham = new Slytherin("Грэхэм Монтегю", 50, 40, 50, 60, 60, 55, 80);
        Slytherin gregory = new Slytherin("Грегори Гойл", 40, 45, 30, 40, 50, 20, 60);

        Hufflepuff zachariah = new Hufflepuff("Захария Смит", 60, 55, 65, 70, 50);
        Hufflepuff cedric = new Hufflepuff("Седрик Диггори", 70, 60, 70, 60, 55);
        Hufflepuff justin = new Hufflepuff("Джастин Финч-Флетчли", 65, 51, 60, 60, 50);

        Ravenclaw zhou = new Ravenclaw("Чжоу Чанг", 45, 45, 60, 50, 55, 70);
        Ravenclaw padma = new Ravenclaw("Падма Патил", 50, 50, 55, 60, 40, 66);
        Ravenclaw marcus = new Ravenclaw("Маркус Белби", 60, 47, 44, 64, 53, 69);

        print.print(harry);
        print.print(graham);
        print.print(zachariah);
        print.print(marcus);

        print.printBestStudent(ron, zhou);

        print.printBestStudentOfFaculty(harry, hermione);
        print.printBestStudentOfFaculty(draco, gregory);
        print.printBestStudentOfFaculty(cedric, justin);
        print.printBestStudentOfFaculty(padma, marcus);
    }
}