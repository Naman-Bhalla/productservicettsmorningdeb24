package dev.naman.productservicettsmorningdeb24.services;

import dev.naman.productservicettsmorningdeb24.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId);

    List<Product> getProducts();
}
