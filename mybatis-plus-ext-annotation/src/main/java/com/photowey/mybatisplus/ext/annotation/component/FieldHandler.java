package com.photowey.mybatisplus.ext.annotation.component;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * {@code FieldHandler}
 * 标记: 该 {@code Bean} 是一个 {@code IFieldHandler} 的实例
 *
 * @author photowey
 * @date 2022/02/19
 * @since 1.0.0
 */
@Inherited
@Documented
@Component
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface FieldHandler {

    String value() default "";
}
