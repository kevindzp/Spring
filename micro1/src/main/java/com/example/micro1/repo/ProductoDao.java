package com.example.micro1.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.micro1.entity.Producto;

public interface ProductoDao extends CrudRepository<Producto, Long> {

}
