package com.msa.souleymanedioufditi5.dao;

import com.msa.souleymanedioufditi5.model.Product;

import java.util.List;

public interface ProductDao {

    public List<Product> findAll();
    public Product findById(int id);
    public Product save(Product product);
}
