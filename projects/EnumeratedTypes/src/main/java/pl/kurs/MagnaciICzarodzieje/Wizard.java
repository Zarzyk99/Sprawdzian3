package pl.kurs.MagnaciICzarodzieje;

public class Wizard {
    private String name;
    private double healthPoints = 200.0;
    private long age;
    private WizardType wizardType;



    public Wizard(String name, long age, WizardType wizardType) {
        this.name = name;
        this.age = age;
        this.wizardType = wizardType;
    }

    public void throwSpell(String spellName, Wizard attackedWizard) {

        if (spellName.equals("heal_self")) {
            heal();
        } else if (spellName.equals("heal_enemy"))
            attackedWizard.heal();

        if (spellName.equals("fireball")) {
            attackedWizard.dealDamage(25);
        }

        if (spellName.equals("lighting strike")) {
            attackedWizard.dealDamage(20);
        }
    }

    private void heal() {
        healthPoints += 30;
        if (healthPoints > 200)
            healthPoints = 200;
    }

    public void dealDamage(int damage) {
        healthPoints -= damage;
        if (healthPoints < 0)
            healthPoints = 0;
    }

    public double getHealthPoints() {
        return healthPoints;
    }

    @Override
    public String toString() {
        return "Wizard{" +
                "name='" + name + '\'' +
                ", healthPoints=" + healthPoints +
                ", age=" + age +
                ", wizardType=" + wizardType +
                '}';
    }
}
