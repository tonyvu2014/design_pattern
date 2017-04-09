package com.tonyvu.designpattern.observer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class Producer {
	
	private Queue<Integer> producerQueue;
	private List<Consumer> consumers;
	
	public Producer() {
		producerQueue = new LinkedList<>();
		consumers = new ArrayList<>();
	}
	
	public List<String> produce(Integer productId) {
		producerQueue.offer(productId);
		return notifyConsumers(productId);
	}
	
	public void registerConsumer(Consumer consumer) {
		consumers.add(consumer);
	}
	
	public List<String> notifyConsumers(Integer productId) {
		List<String> messages = consumers.parallelStream().map(consumer -> consumer.getNotified(productId)).collect(Collectors.toList());
		return messages;
	}

}
