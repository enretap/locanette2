package com.locanette.jobs;

import java.util.List;

import com.locanette.entities.Order;

public interface IOrderJob {
	public Order createOrder(Order order);
	public Order updateOrder(Order order);
	public List<Order> ordersList();
	public List<Order> searchOrders(Order order);
}
