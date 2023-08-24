package com.seer.customSwagger.common.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;


@NoArgsConstructor
@Getter
public class SwaggerResultDto {
    private final boolean success = false;
    private int code;
    private HttpStatus status;
    private String message;

    public SwaggerResultDto(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public SwaggerResultDto(Integer code, HttpStatus status, String message) {
        this.code = code;
        this.status = status;
        this.message = message;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
