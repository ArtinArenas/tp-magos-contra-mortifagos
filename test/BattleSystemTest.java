import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import character.Character;
import deathEater.DeathEaterFollower;
import exceptions.AllyFireException;
import wizard.BattalionWizard;
import wizard.WizardStudent;

class BattleSystemTest {

	// Prueba que el soporte cure a un aliado.
	@Test
	void testSupportSpellHealsAlly() {
		WizardStudent caster = new WizardStudent();
		WizardStudent ally = new WizardStudent();
		ally.healthDown(40);
		int healthBefore = ally.getHealthPoints();

		caster.support(ally, "Ferula");

		assertTrue(ally.getHealthPoints() > healthBefore);
	}

	// Prueba que un hechizo de defensa aumente la defensa del aliado.
	@Test
	void testDefenseSpellIncreasesDefense() {
		WizardStudent caster = new WizardStudent();
		WizardStudent ally = new WizardStudent();
		int defenseBefore = ally.getDefense();

		caster.support(ally, "Protego");

		assertTrue(ally.getDefense() > defenseBefore);
	}

	// Prueba que no se pueda lanzar un hechizo ofensivo sobre un aliado.
	@Test
	void testOffensiveSpellCannotTargetAlly() {
		WizardStudent caster = new WizardStudent();
		WizardStudent ally = new WizardStudent();

		assertThrows(AllyFireException.class, () -> caster.attack(ally, "Expelliarmus"));
	}

	// Prueba que un batallón de magos pueda atacar sin fallar.
	@Test
	void testBattalionWizardAttackDoesNotThrow() {
		BattalionWizard battalion = new BattalionWizard();
		battalion.addWizard(new WizardStudent());
		battalion.addWizard(new WizardStudent());
		Character target = new DeathEaterFollower();

		assertDoesNotThrow(() -> battalion.attack(target));
	}

	// Prueba que un batallón de magos pueda apoyar a un aliado sin fallar.
	@Test
	void testBattalionWizardSupportDoesNotThrow() {
		BattalionWizard battalion = new BattalionWizard();
		battalion.addWizard(new WizardStudent());
		battalion.addWizard(new WizardStudent());
		Character ally = new WizardStudent();

		assertDoesNotThrow(() -> battalion.support(ally));
	}
}
