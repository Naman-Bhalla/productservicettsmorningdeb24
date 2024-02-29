package dev.naman.productservicettsmorningdeb24.controllers;

import dev.naman.productservicettsmorningdeb24.dtos.CreateProductRequestDto;
import dev.naman.productservicettsmorningdeb24.models.Product;
import dev.naman.productservicettsmorningdeb24.services.FakeStoreProductService;
import dev.naman.productservicettsmorningdeb24.services.ProductService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
public class ProductController {

//    private Map<Integer, Integer> mp = new TreeMap<>();
//    List<Integer> li = new ArrayList<>();

    private ProductService productService;
    private RestTemplate restTemplate;

//    private ProductService productService2 = new FakeStoreProductService();


    public ProductController(ProductService productService,
                             RestTemplate restTemplate
    ) {
        this.productService = productService;
        this.restTemplate = restTemplate;
    }

// private ProductService productService;

    // POST /products
    // RequestBody
    // {
    //     title:
    //     description:
    //     price:
    //     category: "mobile"
    // }
    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductRequestDto request) {
        return productService.createProduct(
                request.getTitle(),
                request.getDescription(),
                request.getCategory(),
                request.getPrice(),
                request.getImage()
        );
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