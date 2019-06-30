package com.locanette.controllers;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.GregorianCalendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.locanette.entities.Customer;
import com.locanette.entities.Operation;
import com.locanette.entities.Order;
import com.locanette.entities.OrderProduct;
import com.locanette.entities.Product;
import com.locanette.entities.Supplier;
import com.locanette.jobs.IOrderJob;
import com.locanette.repositories.CustomerRepository;
import com.locanette.repositories.OperationRepository;
import com.locanette.repositories.ProductRepository;

@Controller
public class OrderController {
	
	@Autowired
	private IOrderJob orderJob;
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private OperationRepository operationRepository;
	@Autowired
	private ProductRepository productRepository;
	
	
	
	//Access to orders home
	@RequestMapping("/admin/order/home")
	public String list(Model model) {
		model.addAttribute("orders", orderJob.ordersList());
		return "back/orders/home";
	}
	
	//Create order
	@RequestMapping(value="/admin/order/create",method=RequestMethod.POST)
	public String create(String customerType,long customertId,String firstName,String lastName,
			String phoneNumber,String email,String code,long operationId,int rentalPeriod,
			String deliveryDateSet,String deliveyPlace,long productId[],long ordered[],double rentalPrice[],
			double damagePrice[], String description[]) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dfs = sdf.parse(deliveryDateSet);
        
        String returnDate = addDays(deliveryDateSet,rentalPeriod);
        Date returnDateSet = sdf.parse(returnDate);
        
		Operation operation = new Operation();
		operation.setId(operationId);
		
		Customer customer = new Customer();
		if(customerType.equals("old")) {
			customer.setId(customertId);
		}else {
			customer.setLastName(lastName);
			customer.setFirstName(firstName);
			customer.setPhoneNumber(phoneNumber);
			customer.setEmail(email);
		}
		
		Order order = new Order(code,false,false,false,new Date(),rentalPeriod,dfs,
				returnDateSet,deliveyPlace,true,customer,operation);
		
		Collection<OrderProduct> orderProducts = new ArrayList<>();
		for (int i=0; i<productId.length;i++) { 
			Supplier supplier = new Supplier();
			supplier.setId(1);
			Product product = new Product();
			product.setId(productId[(int)i]);
			OrderProduct orderProduct = new OrderProduct(ordered[(int)i],0,rentalPrice[(int)i],
					damagePrice[(int)i],true,supplier,0,order,product,description[(int)i]);
			orderProducts.add(orderProduct);
		}
		order.setProducts(orderProducts);
		
		orderJob.createOrder(order);
		
		return "redirect:/admin/order/new";
	}
	
	//Access to order create's page
	@RequestMapping("/admin/order/new")
	public String newOrder(Model model) {
		model.addAttribute("customers", customerRepository.findAll());
		model.addAttribute("operations", operationRepository.findAll());
		model.addAttribute("products", productRepository.findAll());
		return "back/orders/new";
	}
	
	
	public String addDays(String date, Integer days) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String result = "";
                
		try {
			Date df = sdf.parse(date);
			GregorianCalendar calendar = new java.util.GregorianCalendar();
                        //Calendar calendar = Calendar.getInstance();
			calendar.setTime(df);
			calendar.add (Calendar.DAY_OF_MONTH, days);
			//System.out.println(calendar);
			result = sdf.format(calendar.getTime());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	
	
}
