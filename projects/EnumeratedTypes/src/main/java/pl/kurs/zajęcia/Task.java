package pl.kurs.zajęcia;

import pl.kurs.zajęcia.DifficultyLevel;

public class Task {
//    public static final Task T1 = new Task();analogia dla wyliczeń enuma
//    public static final  Task T2 = new Task();
//    public static final Task T3 = new Task();
//    public static final Task T4 = new Task();



    private String description;

    private DifficultyLevel difficultyLevel;


    public Task(String description, DifficultyLevel difficultyLevel) {
        this.description = description;
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", difficultyLevel=" + difficultyLevel +
                '}';
    }
}
