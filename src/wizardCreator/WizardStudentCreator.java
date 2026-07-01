package wizardCreator;
// Crea estudiantes de magia con sus atributos base.

import wizard.Wizard;
import wizard.WizardStudent;

public class WizardStudentCreator extends WizardCreator {
	@Override
	public Wizard createWizard() {
		return new WizardStudent();
	}
}
