/*
 * generated by Xtext 2.24.0
 */
package ime.xtext.radioDsl;


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class DslStandaloneSetup extends DslStandaloneSetupGenerated {

	public static void doSetup() {
		new DslStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
