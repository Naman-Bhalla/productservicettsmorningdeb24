package dev.naman.productservicettsmorningdeb24.repositories;

import dev.naman.productservicettsmorningdeb24.models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findByTitle(String title);

    Category save(Category category);
}
