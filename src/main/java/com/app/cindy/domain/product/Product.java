package com.app.cindy.domain.product;

import com.app.cindy.domain.BaseEntity;
import com.app.cindy.domain.Category;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;

@Entity
@Table(name = "Product")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
public class Product extends BaseEntity {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name="img_url")
    private String imgUrl;

    @Column(name="name")
    private String name;


    @ManyToOne
    @JoinColumn(name = "brand_id", nullable = false,insertable=false, updatable=false)
    private Brand brand;

    @Column(name="brand_id")
    private Long brandId;


    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false,insertable=false, updatable=false)
    private Category category;

    @Column(name="category_id")
    private Long categoryId;

    @Column(name="gender")
    private String gender;

    @Column(name="type")
    private String type;

    //상하의 구분분



}
