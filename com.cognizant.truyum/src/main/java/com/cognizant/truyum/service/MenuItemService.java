package com.cognizant.truyum.service;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cognizant.truyum.dao.MenuItemDaoCollectionImpl;
import com.cognizant.truyum.model.MenuItem;

@Service
@Component
public class MenuItemService {

	@Autowired
	private MenuItemDaoCollectionImpl ser;
	public ArrayList<MenuItem> getAllMenu()
	{
		return ser.getMenuItemListCustomer();
	}
	public MenuItem getItemById(int id) {
		// TODO Auto-generated method stub
		for(MenuItem mi:ser.getMenuItemListCustomer())
		{
			if(mi.getId()==id)
			{
				return mi;
			}
		}
		return null;
	}
	public void updateMenu(MenuItem menu) {
		// TODO Auto-generated method stub
		int flag=0;
		for(int i=0;i<ser.getMenuItemListCustomer().size();i++)
		{
			
			MenuItem mt=ser.getMenuItemListCustomer().get(i);
			if(mt.getId()==menu.getId())
			{
				ser.getMenuItemListCustomer().set(i,menu);
				flag=1;
				break;
			}
		}
		if(flag==0)
			ser.getMenuItemListCustomer().add(menu);
		
		
		
	}
}
