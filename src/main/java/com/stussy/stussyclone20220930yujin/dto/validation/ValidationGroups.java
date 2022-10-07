package com.stussy.stussyclone20220930yujin.dto.validation;

public interface ValidationGroups {

    public interface NotBlankGroup {};
    public interface SizeGroup {};
    public interface PatternCheckGroup {};

}


// 혹시 인터페이스를 사용하는 이유가 다중상속이 가능해서 인가용?
// 클래스 해도 상관없음. 시퀀스에서 클래스 불러와서 쓰려고
