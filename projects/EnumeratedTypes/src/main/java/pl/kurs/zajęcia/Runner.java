package pl.kurs.zajęcia;

import static pl.kurs.zajęcia.GamePlatform.*;

public class Runner {
    public static void main(String[] args) {
        Task task = new Task("Przeżyć w Polsce 1 dzień godnie", DifficultyLevel.MEDIUM);
        System.out.println(task);

//tu koniec

        VideoGame tomb = new VideoGame("Tomb Raider", GameCategory.TPP, PS4, PS5);
        System.out.println(tomb);


        System.out.println(DifficultyLevel.HARD);
        //System.out.println(Task.T1);


        //metody enumów
        //metoda valueOf(), metoda zwraca wyliczenie na podstawie Stringa z nazwą wyliczenia
        //DifficultyLevel hard = DifficultyLevel.valueOf("HARD");
        //DifficultyLevel easyLevel = Enum.valueOf(DifficultyLevel.class, "EASY");
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Tworzenie taska");
//        System.out.println("Podaj opis taska");
//        String nameTask = scanner.nextLine();
//        System.out.println("podaj poziom trudnośći taska");
//        String difficultyLevel = scanner.nextLine();
//        Task task1 = new Task(nameTask, DifficultyLevel.valueOf(difficultyLevel.toUpperCase()));
//        scanner.close();
//        System.out.println(task1);


        //metoda name()/toString(), zwraca Stringa z nazwą wyliczenia
        String constantName = DifficultyLevel.MEDIUM.name();
        System.out.println(constantName);


        //metoda ordinal(), zwraca indeks wyliczenia w formie inta
//
//        int index = DifficultyLevel.MEDIUM.ordinal();
//        System.out.println(index);


        //metoda values(), zwraca tablice wszystkich wyliczeń
//        DifficultyLevel[] values = DifficultyLevel.values();
//        System.out.println(Arrays.toString(values));

        DifficultyLevel.MEDIUM.printDescription();
        DifficultyLevel.HARD.printDescription();
        DifficultyLevel.VERY_HARD.printDescription();


    }
}
