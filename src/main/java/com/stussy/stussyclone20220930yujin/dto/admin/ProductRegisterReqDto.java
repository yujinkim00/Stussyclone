package com.stussy.stussyclone20220930yujin.dto.admin;


import lombok.Data;

import javax.validation.constraints.Min;

@Data
public class ProductRegisterReqDto {
    private String category;
    private String name;
    @Min(value = 100, message = "가격은 최소 100원입니다." )
    private int price;
    private String simpleInfo;
    private String detailInfo;
    private String optionInfo;
    private String managementInfo;
    private String shippingInfo;

}
