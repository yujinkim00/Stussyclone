package com.stussy.stussyclone20220930yujin.domain;

import com.stussy.stussyclone20220930yujin.dto.admin.ProductMstOptionResDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class OptionProductMst {
    private int pdt_id;
    private String category;
    private String pdt_name;

    public ProductMstOptionResDto toDto() {
        return ProductMstOptionResDto.builder()
                .pdtId(pdt_id)
                .category(category)
                .pdtName(pdt_name)
                .build();
    }
}
