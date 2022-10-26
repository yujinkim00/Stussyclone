package com.stussy.stussyclone20220930yujin.dto.admin;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductSizeOptionRespDto {

    private int sizeId;
    private String sizeName;

}
