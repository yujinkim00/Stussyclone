package com.stussy.stussyclone20220930yujin.dto;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor

public class CMRespDto <T>{
    private String msg;
    private T data;
}
