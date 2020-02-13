package guice.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

	public static void main(String[] args) {
	    Injector injector = Guice.createInjector(new ExampleModule());
	    CounterPrinter printer1 = injector.getInstance(CounterPrinter.class);
	    printer1.print();
	    CounterPrinter printer2 = injector.getInstance(CounterPrinter.class);
	    printer2.print();	    
	}

}
