package character;
// Define la creación base de los personajes del juego.

import deathEater.DeathEater;
import wizard.Wizard;

public interface CharacterCreator {
	Wizard createWizard();
	DeathEater createDeathEater();
}
