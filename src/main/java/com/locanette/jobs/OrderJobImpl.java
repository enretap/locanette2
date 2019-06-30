package com.locanette.jobs;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.locanette.entities.Order;
import com.locanette.repositories.CustomerRepository;
import com.locanette.repositories.OrderProductRepository;
import com.locanette.repositories.OrderRepository;

@Service
@Transactional
public class OrderJobImpl implements IOrderJob{
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private OrderProductRepository orderProductRepository;

	@Override
	public Order createOrder(Order order) {
		// TODO Auto-generated method stub
		if(order.getCustomer().getId()==0) {
			customerRepository.save(order.getCustomer());
			orderRepository.save(order);
			if(!(order.getProducts()).isEmpty())
			orderProductRepository.saveAll(order.getProducts());
		}else {
			orderRepository.save(order);
			if(!(order.getProducts()).isEmpty())
			orderProductRepository.saveAll(order.getProducts());
		}
		return order;
	}

	@Override
	public Order updateOrder(Order order) {
		// TODO Auto-generated method stub
		orderRepository.save(order);
		return order;
	}

	@Override
	public List<Order> ordersList() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

	@Override
	public List<Order> searchOrders(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

}
