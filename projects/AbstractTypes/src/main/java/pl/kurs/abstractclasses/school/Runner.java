package pl.kurs.abstractclasses.school;

public class Runner {
    public static void main(String[] args) {
        Student student1 = new Student("Jacek", "Konopka", 400);
        Student student2 = new Student("Marek", "Psikuta", 600);
        Student student3 = new Student("Monika", "Blaszka", 1200);
        Teacher teacher1 = new Teacher("Janusz", "Lizak", 4565.87);
        Teacher teacher2 = new Teacher("Marzena", "Krzak", 4395.45);
        Teacher teacher3 = null;

        Person[] people = {student1, student2, student3, teacher1, teacher2, teacher3};
        teacher1.introduceYourself();
        teacher2.introduceYourself();
        student1.introduceYourself();
        student2.introduceYourself();
        student3.introduceYourself();
        System.out.println("średni dochód na osobę wynosi: " + averageIncome(people) + " złotych");

    }

    public static double averageIncome(Person[] people) {
            if (people == null)
                return 0;
            else {
                double sum = 0;
                int cnt = 0;

                for (int i = 0; i < people.length; i++) {
                    if (people[i] != null) {
                        sum += people[i].getIncome();
                        cnt++;
                    }
                }
                return sum / cnt;
            }
    }
}
