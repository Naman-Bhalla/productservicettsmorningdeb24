package dev.naman.productservicettsmorningdeb24.controllers;

import dev.naman.productservicettsmorningdeb24.models.Product;
import dev.naman.productservicettsmorningdeb24.services.FakeStoreProductService;
import dev.naman.productservicettsmorningdeb24.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {

//    private Map<Integer, Integer> mp = new TreeMap<>();
//    List<Integer> li = new ArrayList<>();

    private ProductService productService;
//    private ProductService productService2 = new FakeStoreProductService();


    public ProductController(ProductService productService) {
        this.productService = productService;
    }

// private ProductService productService;

    // POST /products
    // RequestBody
    // {
    //     title:
    //     description:
    //     price:
    // }
    @PostMapping("/products")
    public void createProduct() {

    }

    // GET /products/1
    // GET /products/201

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long productId) {
        return productService.getSingleProduct(productId);
    }

    @GetMapping("/products")
    public void getAllProduct() {

    }

    public void updateProduct() {

    }
}

// allProducts - X
// all APIs should be structured around resources
// GET  /products