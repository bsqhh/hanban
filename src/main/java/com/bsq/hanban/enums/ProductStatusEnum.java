package com.bsq.hanban.enums;

import lombok.Getter;

/**
 * 商品状态
 *
 */
@Getter
public enum ProductStatusEnum implements CodeEnum {
    UP(0, "未起飞"),
    DOWN(1, "已起飞")
    ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
