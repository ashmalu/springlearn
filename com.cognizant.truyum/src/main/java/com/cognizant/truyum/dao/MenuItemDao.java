package com.cognizant.truyum.dao;

import java.util.ArrayList;

import com.cognizant.truyum.model.MenuItem;

public class MenuItemDao {

	
	
	public static ArrayList<MenuItem> menu1=new ArrayList<>();
	public MenuItemDao()
	{
		
	}

	public static ArrayList<MenuItem> getMenu1() {
		return menu1;
	}

	public static void setMenu1(ArrayList<MenuItem> menu1) {
		MenuItemDao.menu1 = menu1;
	}	
}
