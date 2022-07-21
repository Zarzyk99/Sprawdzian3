package pl.kurs.MagnaciICzarodzieje;

public enum SpellType {
    HEAL("heal", 30.0, 0),
    FIREBALL("fireball", 0, -25.0),
    LIGHTING_STRIKE("lighting strike", 0, -20.0);
    private String spellName;
    private double treatment;
    private double damage;

    SpellType(String spellName, double treatment, double damage) {
        this.spellName = spellName;
        this.treatment = treatment;
        this.damage = damage;
    }
}
