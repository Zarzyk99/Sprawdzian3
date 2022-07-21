package pl.kurs.zajęcia;

public enum DifficultyLevel {//enum jest finalną klasą która rozszerza klasę Enum
    EASY("bułka z masłem!"),
    MEDIUM("można się spocić"),
    HARD("cieżko jest"),
    VERY_HARD("O boże o kurwa"){
        @Override
        public void printDescription() {
            super.printDescription();
            System.out.println("... ale damy radę");
        }
    };

    private final String description;

    DifficultyLevel(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
    public void printDescription(){
        System.out.println("Opis wyliczenia : " + description);
    }
}
