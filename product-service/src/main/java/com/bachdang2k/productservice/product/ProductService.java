package com.bachdang2k.productservice.product;

import java.util.List;

public interface ProductService {

    void  createProduct(ProductRequest request);

    List<ProductResponse> getAllProducts();

}
