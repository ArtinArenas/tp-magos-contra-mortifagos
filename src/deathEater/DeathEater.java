package deathEater;
// Representa a un mortífago dentro del combate.

import character.Character;

public interface DeathEater {
	void darkAttack(Character target, String spellName);
	void specialSpell(Character target, String spellName);
}
