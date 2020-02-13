package guice.example;

import java.util.concurrent.atomic.AtomicInteger;

public class CounterServiceImpl implements CounterService {

	private AtomicInteger integer = new AtomicInteger();
	
	@Override
	public int incrementAndGet() {
		return integer.incrementAndGet();
	}

}
