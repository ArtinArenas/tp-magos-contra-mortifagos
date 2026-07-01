package spellCreator;
// Crea instancias del hechizo Expelliarmus.

import spell.Spell;
import spell.Expelliarmus;

public class ExpelliarmusCreator extends SpellCreator {

	@Override
	public Spell createSpell() {
		return new Expelliarmus();
	}

}
