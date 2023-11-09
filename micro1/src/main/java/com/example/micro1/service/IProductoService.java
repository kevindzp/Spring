package com.example.micro1.service;

import java.util.List;

import com.example.micro1.entity.Producto;

public interface IProductoService {
	
	public List<Producto>findAll();
	public Producto findById(Long id);

}
