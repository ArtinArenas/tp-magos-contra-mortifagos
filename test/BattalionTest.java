import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import spell.Expelliarmus;
import wizard.BattalionWizard;
import wizard.WizardStudent;
import deathEater.BattalionDeathEater;
import deathEater.DeathEaterFollower;

// Pruebas sobre el comportamiento de los batallones: agregación y colección de hechizos.
class BattalionTest {

    // Verifica que se pueden agregar magos al batallón y que el tamaño coincide.
    @Test
    void testBattalionAddAndSize() {
        BattalionWizard battalion = new BattalionWizard();
        battalion.addWizard(new WizardStudent());
        battalion.addWizard(new WizardStudent());

        assertEquals(2, battalion.getBattalionSize());
    }

    // Verifica que los hechizos de los miembros del batallón se agregan al conjunto del batallón.
    @Test
    void testBattalionAggregatedSpells() {
        BattalionWizard battalion = new BattalionWizard();
        WizardStudent w1 = new WizardStudent();
        WizardStudent w2 = new WizardStudent();
        battalion.addWizard(w1);
        battalion.addWizard(w2);

        // El conjunto de hechizos del batallón debe contener al menos Expelliarmus.
        assertTrue(battalion.getSpells().contains(new Expelliarmus()));
    }

    // Verifica que tanto batallones de magos como de mortífagos puedan ejecutar operaciones básicas sin excepciones.
    @Test
    void testBattalionOperationsDoNotThrow() {
        BattalionWizard bW = new BattalionWizard();
        bW.addWizard(new WizardStudent());
        BattalionDeathEater bD = new BattalionDeathEater();
        bD.getClass(); // referencia para evitar warning
        bD.addSpell(new Expelliarmus()); // agregar un hechizo para evitar nulls en iteraciones
        // Se asegura que no arroje al atacar/soportar (se probará ataque simple de batallón contra un follower individual)
        DeathEaterFollower follower = new DeathEaterFollower();
        assertDoesNotThrow(() -> bW.attack(follower));
        assertDoesNotThrow(() -> bW.support(new WizardStudent()));
    }
}
