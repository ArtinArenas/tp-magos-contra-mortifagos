package wizard;
// Representa a un mago con sus habilidades y atributos.

import character.Character;
import spell.Spell;

public interface Wizard {
	void attack(Character target, String spellName);
	void support(Character target, String spellName);
}
