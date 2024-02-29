package dev.naman.productservicettsmorningdeb24;

import dev.naman.productservicettsmorningdeb24.controllers.ProductController;
import dev.naman.productservicettsmorningdeb24.models.Product;
import dev.naman.productservicettsmorningdeb24.services.FakeStoreProductService;
import dev.naman.productservicettsmorningdeb24.services.ProductService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Productservicettsmorningdeb24Application {
    public static void main(String[] args) {

//        Product p = new Product();
//        p.
//        Product p = new Product()

//        ProductController productController = new ProductController(new FakeStoreProductService());

        SpringApplication.run(Productservicettsmorningdeb24Application.class, args);
    }

}
