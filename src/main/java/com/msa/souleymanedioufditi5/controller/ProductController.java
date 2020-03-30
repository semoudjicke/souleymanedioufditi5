package com.msa.souleymanedioufditi5.controller;

import com.msa.souleymanedioufditi5.dao.ProductDao;
import com.msa.souleymanedioufditi5.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductDao productDao;

    //Souleymane Diouf DITI5
    //Produits
    @GetMapping(value = "Produits")
    public List<Product> ListeProduits(){
        return productDao.findAll();
    }

    //Souleymane Diouf DITI5
    //Produits/{id}
    @GetMapping(value = "Produits/{id}")
    public Product afficherUnProduit(@PathVariable int id){
        Product product = new Product(id, new String("aspirateur"), 100);
        return product;
    }

    //Souleymane Diouf DITI5
    //ajouter un produit
    @PostMapping(value = "/Produits")
    public void ajouterProduit(@RequestBody Product product) {
        productDao.save(product);
    }
}
