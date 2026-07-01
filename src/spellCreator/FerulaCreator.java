package spellCreator;
// Crea instancias del hechizo Ferula.

import spell.Spell;
import spell.Ferula;

public class FerulaCreator extends SpellCreator {

	@Override
	public Spell createSpell() {
		return new Ferula();
	}

}
