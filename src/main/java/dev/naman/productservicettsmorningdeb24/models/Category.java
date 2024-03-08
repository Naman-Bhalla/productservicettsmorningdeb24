package dev.naman.productservicettsmorningdeb24.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
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
public class Category extends BaseModel {
    private String title;
    @OneToMany(mappedBy = "category", cascade = {CascadeType.REMOVE})
//    @ManyToMany(mappedBy = "dhqwohewhjepd")
    private List<Product> products;
}
