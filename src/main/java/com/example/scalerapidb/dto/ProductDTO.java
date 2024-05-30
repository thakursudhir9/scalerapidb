package com.example.scalerapidb.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class ProductDTO {
    private String title;
    private String description;
    private double price;
    private String imageUrl;
    private String categoryName;
    private Long categoryId;// assuming you want to return the category name

    @Override
    public String toString() {
        return "ProductDTO{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", imageUrl='" + imageUrl + '\'' +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }
}
