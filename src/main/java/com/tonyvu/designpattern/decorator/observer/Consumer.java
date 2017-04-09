package com.tonyvu.designpattern.decorator.observer;

public class Consumer {
	
	private long consumerId;
	
	public void setConsumerId(long consumerId) {
		this.consumerId = consumerId;
	}
	
	public long getConsumerId() {
		return this.consumerId;
	}
    
	public String getNotified(Integer productId) {
		String message = String.format("Consumer %d has received notification about product %d", getConsumerId(), productId);
		System.out.println(message);
		return message;
	}
}
