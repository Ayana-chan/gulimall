package cn.ayana.gulimall.product.advice;

import cn.ayana.gulimall.common.exception.BizCodeEnum;
import cn.ayana.gulimall.common.utils.R;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestControllerAdvice(basePackages = "cn.ayana.gulimall.product.controller")
public class GulimallExceptionControllerAdvice {

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public R handleValidException(MethodArgumentNotValidException e) {

        log.error("数据校验出现问题:{}，异常类型:{}", e.getMessage(), e.getClass());
        BindingResult result = e.getBindingResult();

        Map<String, String> map = new HashMap<>();
        result.getFieldErrors().forEach((item) -> {
            //错误提示
            String message = item.getDefaultMessage();
            //错误的属性名字
            String field = item.getField();
            map.put(field, message);
        });

        return R.error(BizCodeEnum.VALID_EXCEPTION.getCode(), BizCodeEnum.VALID_EXCEPTION.getMsg()).put("data", map);
    }

    @ExceptionHandler(value = Exception.class)
    public R handleException(Exception e) {

        return R.error(BizCodeEnum.UNKNOWN_EXCEPTION.getCode(), BizCodeEnum.UNKNOWN_EXCEPTION.getMsg());
    }

}
