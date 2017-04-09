package com.tonyvu.designpattern.observer;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tonyvu.designpattern.decorator.observer.Consumer;
import com.tonyvu.designpattern.decorator.observer.Producer;

public class ProducerAndConsumerTest {
	
	private Producer producer;
	private Consumer consumer1, consumer2;

	@Before
	public void setUp() throws Exception {
		producer = new Producer();
		consumer1 = new Consumer();
		consumer1.setConsumerId(1l);
		consumer2 = new Consumer();
		consumer2.setConsumerId(2l);
		
		producer.registerConsumer(consumer1);
		producer.registerConsumer(consumer2);
	}

	@After
	public void tearDown() throws Exception {
		producer = null;
		consumer1 = null;
		consumer2 = null;
	}

	@Test
	public void test() {
		List<String> messages = producer.produce(1);
		assertEquals(messages.size(), 2);
		assertTrue(messages.contains("Consumer 1 has received notification about product 1"));
		assertTrue(messages.contains("Consumer 2 has received notification about product 1"));
	}

}
