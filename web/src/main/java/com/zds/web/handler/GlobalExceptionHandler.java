package com.zds.web.handler;

import com.zds.web.exception.CommonException;
import com.zds.web.util.APIResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.BindException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.ConstraintViolationException;

/**
 * 统一异常处理
 * Created by zhangds on 2018/10/29.
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    private static final Logger logger = LoggerFactory.getLogger(CommonException.class);

    /**
     * 参数异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = ConstraintViolationException.class)
    @ResponseBody
    public APIResponse paramException(ConstraintViolationException e) {

        String msg = e.getLocalizedMessage();
        logger.error("find exception:e={}", e.getMessage());
        return APIResponse.fail(msg);
    }

    /**
     * 业务抛出异常
     *
     * @param e
     * @return
     */
    @ExceptionHandler(value = CommonException.class)
    @ResponseBody
    public APIResponse businessException(CommonException e) {

        String msg = e.getErrorCode();
        logger.error("find exception:e={}", e.getMessage());
        return APIResponse.fail(msg);
    }


    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public APIResponse normal(Exception e) {
        return APIResponse.fail("异常：" + e.getMessage());
    }

    @ExceptionHandler(value = BindException.class)
    @ResponseBody
    public APIResponse bindException(BindException e) {
        StringBuilder sb = new StringBuilder();
        e.getAllErrors().forEach(objectError -> {
            sb.append(objectError.getDefaultMessage());
        });
        logger.info("参数异常：{}", sb.toString());
        return APIResponse.fail("参数异常：" + sb.toString());
    }
}
