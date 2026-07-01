package spellCreator;
// Crea instancias del hechizo Finite Incantatem.

import spell.Spell;
import spell.FiniteIncantatem;

public class FiniteIncantatemCreator extends SpellCreator {

	@Override
	public Spell createSpell() {
		return new FiniteIncantatem();
	}

}
