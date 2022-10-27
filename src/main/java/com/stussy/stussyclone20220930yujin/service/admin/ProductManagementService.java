package com.stussy.stussyclone20220930yujin.service.admin;

import com.stussy.stussyclone20220930yujin.dto.admin.*;

import java.util.List;

public interface ProductManagementService {
    public List<CategoryResponseDto> getCategoryList() throws Exception;
    public void registerMst(ProductRegisterReqDto productRegisterReqDto) throws Exception;

    public List<ProductMstOptionResDto> getProductMstList() throws Exception;

    public List<?> getSizeList (int productId) throws Exception;

    public void checkDuplicatedColor(ProductRegisterDtlReqDto productRegisterDtlReqDto) throws Exception;

    public void registerDtl(ProductRegisterDtlReqDto productRegisterDtlReqDto) throws Exception;

    public void registerImg(ProductImgReqDto productImgReqDto) throws Exception;
}
