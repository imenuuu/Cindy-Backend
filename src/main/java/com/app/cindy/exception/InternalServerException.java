package com.app.cindy.exception;

import com.app.cindy.constants.CommonResponseStatus;
import lombok.Getter;

@Getter
public class InternalServerException extends BaseException {
    private String message;

    public InternalServerException(String message) {
        super(CommonResponseStatus._INTERNAL_SERVER_ERROR);
        this.message = message;
    }

    public InternalServerException(CommonResponseStatus errorCode, String message) {
        super(errorCode);
        this.message = message;
    }

    public InternalServerException(CommonResponseStatus errorCode) {
        super(errorCode);
    }
}
