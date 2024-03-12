package dev.naman.productservicettsmorningdeb24.controllers;

import dev.naman.productservicettsmorningdeb24.dtos.CreateProductRequestDto;
import dev.naman.productservicettsmorningdeb24.dtos.ErrorDto;
import dev.naman.productservicettsmorningdeb24.exceptions.ProductNotFoundException;
import dev.naman.productservicettsmorningdeb24.models.Product;
import dev.naman.productservicettsmorningdeb24.services.FakeStoreProductService;
import dev.naman.productservicettsmorningdeb24.services.ProductService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ProductController {

//    private Map<Integer, Integer> mp = new TreeMap<>();
//    List<Integer> li = new ArrayList<>();

    private ProductService productService;
    private RestTemplate restTemplate;

//    private ProductService productService2 = new FakeStoreProductService();


    public ProductController(@Qualifier("selfProductService") ProductService productService,
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
    public Product getProductDetails(@PathVariable("id") Long productId) throws ProductNotFoundException {
        return productService.getSingleProduct(productId);
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() throws ProductNotFoundException {

        List<Product> products = productService.getProducts();

//        throw new ProductNotFoundException("Bla bla bla");

        ResponseEntity<List<Product>> response = new ResponseEntity<>(products, HttpStatus.OK);
        return response;
    }

    public void updateProduct() {

    }

//    @ExceptionHandler(ProductNotFoundException.class)
//    public ResponseEntity<ErrorDto> handleProductNotFoundExeption(ProductNotFoundException exception) {
//
//        ErrorDto errorDto = new ErrorDto();
//        errorDto.setMessage(exception.getMessage());
//
//        return new ResponseEntity<>(errorDto, HttpStatus.NOT_FOUND);
////        return null;
//    }

    // Limited to only the exceptions thrown from this controller
    // Controller Advices: Global

    // if this controller ever ends up throwing ProductNotFoundException.class
    // for any reason, don't throw that exception as is.
    // Instead call this method and return what this method is returning
}

// allProducts - X
// all APIs should be structured around resources
// GET  /products