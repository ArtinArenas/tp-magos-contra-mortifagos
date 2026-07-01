package wizardCreator;
// Crea profesores de magia con sus atributos base.

import wizard.Wizard;
import wizard.WizardTeacher;

public class WizardTeacherCreator extends WizardCreator {
	@Override
	public Wizard createWizard() {
		return new WizardTeacher();
	}
}
