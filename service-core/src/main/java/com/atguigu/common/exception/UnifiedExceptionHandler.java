package com.atguigu.common.exception;

import com.atguigu.common.result.R;
import com.atguigu.common.result.ResponseEnum;
import org.springframework.jdbc.BadSqlGrammarException;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLException;

/**
 * @author lzhCreate
 * @create 2021-08-26 16:29
 */
@Component
@RestControllerAdvice
public class UnifiedExceptionHandler {
    @ExceptionHandler(Exception.class)
    public R handleException(Exception e) {
        return R.error().message(e.getMessage());
    }

    @ExceptionHandler(BadSqlGrammarException.class)
    public R badSqlGrammarException(BadSqlGrammarException badSqlGrammarException) {
        return R.setResult(ResponseEnum.BAD_SQL_GRAMMAR_ERROR);
    }
}
