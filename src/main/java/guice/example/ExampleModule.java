package guice.example;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;

public class ExampleModule extends AbstractModule {
	@Override 
	protected void configure() {
		bind(CounterService.class).to(CounterServiceImpl.class).in(Scopes.NO_SCOPE);
	}
}
