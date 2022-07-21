package pl.kurs.MagnaciICzarodzieje;

public enum WizardType {
    WIZARD_OF_FIRE("Mag ognia", SpellType.HEAL, SpellType.FIREBALL),
    WIZARD_OF_WIND("Mag wiatru", SpellType.HEAL, SpellType.LIGHTING_STRIKE);
    private final String description;
    private final SpellType[] spellTypes;

    WizardType(String description, SpellType... spellTypes) {
        this.description = description;
        this.spellTypes = spellTypes;
    }
}
