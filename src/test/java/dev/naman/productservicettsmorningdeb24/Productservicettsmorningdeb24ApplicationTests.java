package dev.naman.productservicettsmorningdeb24;

import dev.naman.productservicettsmorningdeb24.repositories.ProductRepository;
import dev.naman.productservicettsmorningdeb24.repositories.projections.ProductProjection;
import dev.naman.productservicettsmorningdeb24.repositories.projections.ProductWithIdAndTitle;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Productservicettsmorningdeb24ApplicationTests {
    @Autowired
    private ProductRepository productRepository;

    @Test
    void contextLoads() {
    }

    @Test
    void testingQueries() {
//           productRepository.findAllByTitle("Hello");
//        productRepository.findByIdIs(1L);

        productRepository
                .findByTitleStartingWithAndIdGreaterThanAndPriceLessThan(
                        "hello", 3L, 400
                );


        List<ProductProjection> pros = productRepository.getTitlesOfProductsOfGivenCategory(
                "2L"
        );
        System.out.println(pros.get(0).getId());
        System.out.println(pros.get(0).getTitle());
    }

}
