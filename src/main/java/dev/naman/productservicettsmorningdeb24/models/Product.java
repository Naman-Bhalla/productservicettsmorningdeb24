package dev.naman.productservicettsmorningdeb24.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Product extends BaseModel{
    private String title;
    private String description;
    private double price;
    private String imageUrl;
//    @ManyToOne
    @ManyToOne(cascade = {CascadeType.PERSIST})
    private Category category;

}
