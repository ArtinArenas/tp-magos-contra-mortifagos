package stateCharacter;
// Representa el estado de muerte de un personaje.

import character.Character;

public class Death extends StateCharacter {
	@Override
	public StateCharacter attack(Character attacker, Character target, String spellName) {
		return this;
	}

	@Override
	public StateCharacter support(Character support, Character target, String spellName) {
		return this;
	}
	
	@Override
	public boolean isLive() {
		return false;
	}
}
