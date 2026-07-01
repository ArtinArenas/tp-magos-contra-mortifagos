package spellCreator;
// Crea instancias del hechizo Protego.

import spell.Spell;
import spell.Protego;

public class ProtegoCreator extends SpellCreator {

	@Override
	public Spell createSpell() {
		return new Protego();
	}

}
