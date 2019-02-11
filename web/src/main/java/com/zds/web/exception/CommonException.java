package com.zds.web.exception;

import com.zds.web.util.APIResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.MessageFormat;

/**
 * 统一异常类
 * Created by zhangds on 2018/10/29.
 */
public class CommonException extends RuntimeException {

    private static final Logger logger = LoggerFactory.getLogger(CommonException.class);
    protected String errorCode;
    protected String[] errorMessageArguments;
    protected APIResponse apiResponse;

    protected CommonException() {
        this("");
    }

    public CommonException(String message) {
        super(message);
        this.errorCode = "fail";
        this.errorMessageArguments = new String[0];
    }

    public CommonException(String message, Throwable cause) {
        super(message, cause);
        this.errorCode = "fail";
        this.errorMessageArguments = new String[0];
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    public String[] getErrorMessageArguments() {
        return this.errorMessageArguments;
    }

    public void setErrorMessageArguments(String[] errorMessageArguments) {
        this.errorMessageArguments = errorMessageArguments;
    }

    public static CommonException withErrorCode(String errorCode) {
        CommonException businessException = new CommonException();
        businessException.errorCode = errorCode;
        return businessException;
    }

    public static CommonException fromAPIResponse(APIResponse apiResponse) {
        CommonException businessException = new CommonException();
        if(apiResponse == null) {
            apiResponse = APIResponse.fail("NULL");
        }

        businessException.apiResponse = apiResponse;
        return businessException;
    }

    public CommonException withErrorMessageArguments(String... errorMessageArguments) {
        if(errorMessageArguments != null) {
            this.errorMessageArguments = errorMessageArguments;
        }

        return this;
    }
    public APIResponse response() {
        if(this.apiResponse != null) {
            return this.apiResponse;
        } else {
            this.apiResponse = APIResponse.widthCode(this.getErrorCode());
            if(this.getErrorMessageArguments() != null && this.getErrorMessageArguments().length > 0) {
                try {
                    this.apiResponse.setMsg(MessageFormat.format(this.apiResponse.getMsg(), this.getErrorMessageArguments()));
                } catch (Exception var2) {
                    logger.error(var2.getMessage());
                }
            }

            return this.apiResponse;
        }
    }

}
