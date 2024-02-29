package dev.naman.productservicettsmorningdeb24.services;

import dev.naman.productservicettsmorningdeb24.dtos.CreateProductRequestDto;
import dev.naman.productservicettsmorningdeb24.models.Product;

import java.util.List;

public interface ProductService {

    Product getSingleProduct(Long productId);

    List<Product> getProducts();

    Product createProduct(String title,
                          String description,
                          String category,
                          double price,
                          String image);
}
