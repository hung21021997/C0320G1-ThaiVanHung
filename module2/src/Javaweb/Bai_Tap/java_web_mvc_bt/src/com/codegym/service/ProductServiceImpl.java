package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<>();
        products.put(1,new Product(1,"Iphone X","1000USD","Apple"));
        products.put(2,new Product(2,"Iphone XI","1500USD","Apple"));
        products.put(3,new Product(3,"Galaxy S10","900USD","SamSung"));
        products.put(4,new Product(4,"Galaxy Note 10","1300USD","SamSung"));
        products.put(5,new Product(5,"RedMi 9","400USD","Xiaomi"));
        products.put(6,new Product(6,"RedMi Note 9","500USD","Xiaomi"));
        products.put(7,new Product(7,"Oppo f11","600USD","Oppo"));
        products.put(8,new Product(8,"Oppo a92","400USD","Oppo"));
    }


    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getIdProduct(), product);
    }

    @Override
    public void update(int idProduct, Product product) {
        products.put(idProduct, product);
    }

    @Override
    public void remove(int idProduct) {
        products.remove(idProduct);
    }

    @Override
    public Product findById(int idProduct) {
        return products.get(idProduct);
    }
}
