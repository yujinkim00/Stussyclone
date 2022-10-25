package com.stussy.stussyclone20220930yujin.dto.admin;


import lombok.Builder;
import lombok.Data;

@Builder
@Data

public class ProductMstOptionResDto {
    private int pdtId;
    private String category;
    private String pdtName;

}
