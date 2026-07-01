package spellCreator;
// Crea instancias del hechizo Fieldfyre.

import spell.Spell;
import spell.Fieldfyre;

public class FieldfyreCreator extends SpellCreator {

	@Override
	public Spell createSpell() {
		return new Fieldfyre();
	}

}
