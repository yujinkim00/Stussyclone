package com.stussy.stussyclone20220930yujin.repository;

import com.stussy.stussyclone20220930yujin.domain.CollectionsProduct;
import com.stussy.stussyclone20220930yujin.domain.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface ProductRepository {
    public List<CollectionsProduct> getProductList(Map<String, Object> map) throws Exception;

    public Product getProduct(int pdtId) throws Exception;

}



