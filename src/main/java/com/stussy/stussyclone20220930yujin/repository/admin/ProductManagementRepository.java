package com.stussy.stussyclone20220930yujin.repository.admin;

import com.stussy.stussyclone20220930yujin.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductManagementRepository {
    public List<ProductCategory> getCategoryList() throws Exception;
    public int saveProductMst(Product product) throws Exception;

    public List<OptionProductMst> getProductMstList() throws Exception;

    public List<OptionsProductSize> getSizeList(int productId) throws Exception;

    public int findProductColor(ProductDetail productDetail) throws Exception;

    public int saveProductDtl(ProductDetail productDetail) throws Exception;
}