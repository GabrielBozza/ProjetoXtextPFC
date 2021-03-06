/*
 * generated by Xtext 2.24.0
 */
package ime.xtext.radioDsl.ui;

import com.google.inject.Injector;
import ime.xtext.radioDsl.ui.internal.RadioDslActivator;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class DslExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return FrameworkUtil.getBundle(RadioDslActivator.class);
	}
	
	@Override
	protected Injector getInjector() {
		RadioDslActivator activator = RadioDslActivator.getInstance();
		return activator != null ? activator.getInjector(RadioDslActivator.IME_XTEXT_RADIODSL_DSL) : null;
	}

}
