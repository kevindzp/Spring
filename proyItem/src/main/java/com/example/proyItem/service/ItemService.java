package com.example.proyItem.service;

import java.util.List;

import com.example.proyItem.models.Item;

public interface ItemService {
	
	public List<Item> findAll();
	public Item findById(Long id, Integer cantidad);


}
