import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import spell.AvadaKedavra;
import spell.Expelliarmus;
import spell.Spell;
import spell.SpellCategory;
import spell.SpellType;

// Pruebas sobre metadatos y propiedades básicas de los hechizos.
class SpellTest {

    // Verifica nombre, tipo, categoria y accuracy de Expelliarmus.
    @Test
    void testExpelliarmusMetadata() {
        Spell s = new Expelliarmus();
        assertEquals("Expelliarmus", s.getName());
        assertEquals(SpellType.OFFENSIVE, s.getType());
        assertEquals(SpellCategory.LIGHT, s.getCategory());
        assertEquals(0.8, s.getAccuracy(), 0.0001);
    }

    // Verifica nombre, tipo, categoria y accuracy de AvadaKedavra.
    @Test
    void testAvadaKedavraMetadata() {
        Spell s = new AvadaKedavra();
        assertEquals("AvadaKedavra", s.getName());
        assertEquals(SpellType.OFFENSIVE, s.getType());
        assertEquals(SpellCategory.DARK, s.getCategory());
        assertEquals(0.15, s.getAccuracy(), 0.0001);
    }
}
