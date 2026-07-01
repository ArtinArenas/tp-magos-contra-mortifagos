package spellCreator;
// Crea instancias del hechizo Cruciatus.

import spell.Spell;
import spell.Crucio;

public class CrucioCreator extends SpellCreator {

	@Override
	public Spell createSpell() {
		return new Crucio();
	}

}
