package pl.kurs.MagnaciICzarodzieje;

public class WizardRunner {
    public static void main(String[] args) {
        Wizard gandalf = new Wizard("Gandalf", 435_423_432, WizardType.WIZARD_OF_WIND);
        Wizard saruman = new Wizard("Saruman", 234_423_234, WizardType.WIZARD_OF_FIRE);

        saruman.throwSpell("fireball", gandalf);
        System.out.println(gandalf.getHealthPoints());

        saruman.throwSpell("heal_enemy", gandalf);
        System.out.println(gandalf.getHealthPoints());
    }
}
