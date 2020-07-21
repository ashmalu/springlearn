package com.cognizant.truyum.service;


import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.CartImp;
import com.cognizant.truyum.model.Cart;
import com.cognizant.truyum.model.MenuItem;
@Component
@Service
public class CartService {

	@Autowired
	private MenuItemService ser;
	@Autowired
	private CartImp carI;
	public ArrayList<Cart>getAllCar()
	{
		 return carI.getAllCartItems();
	}
	public void addCartItem(Cart cart) {
		// TODO Auto-generated method stub
		carI.addCart(cart);
		
	}
	public MenuItem getAllItems(long id, String userId) {
		// TODO Auto-generated method stub
		ArrayList<MenuItem> mt=ser.getAllMenu();
		for(MenuItem m:mt)
		{
			if(m.getId()==id)
			{
				return m;
			}
		}
		
		return null;
		
	}
	public void delete(long menuItemId) {
		ArrayList<Cart> crt=carI.getAllCartItems();
		Iterator<Cart> it=carI.getAllCartItems().iterator();
		 while(it.hasNext())
		 {
			 if(it.next().getProductId()==menuItemId)
			 {
				 it.remove();
			 }
		 }
}
}