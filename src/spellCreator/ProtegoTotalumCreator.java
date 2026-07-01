package spellCreator;
// Crea instancias del hechizo Protego Totalum.

import spell.Spell;
import spell.ProtegoTotalum;

public class ProtegoTotalumCreator extends SpellCreator {

	@Override
	public Spell createSpell() {
		return new ProtegoTotalum();
	}

}
