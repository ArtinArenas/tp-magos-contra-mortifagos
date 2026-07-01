package deathEater;
// Representa a un mortífago dentro del combate.

import character.Character;

public interface DeathEater {
	void darkAttack(Character character);
	void specialSpell(Character character);
}
