package spellCreator;
// Crea instancias del hechizo Confundo.

import spell.Spell;
import spell.Confundo;

public class ConfundoCreator extends SpellCreator {

	@Override
	public Spell createSpell() {
		return new Confundo();
	}

}
