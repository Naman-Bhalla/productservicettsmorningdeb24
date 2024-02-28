package dev.naman.productservicettsmorningdeb24.services;

import dev.naman.productservicettsmorningdeb24.models.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService {


    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }
}
