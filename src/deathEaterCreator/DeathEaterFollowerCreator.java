package deathEaterCreator;
// Crea seguidores mortífagos con sus valores iniciales.

import deathEater.DeathEater;
import deathEater.DeathEaterFollower;

public class DeathEaterFollowerCreator extends DeathEaterCreator {
	@Override
	public DeathEater createDeathEater() {
		return new DeathEaterFollower();
	}
}
