package com.personalblog.core.annotation;

import java.lang.annotation.*;

/***
 * @author 王强 Email : wangqiang@hushijie.com.cn
 * @version 创建时间：2017/9/8
 * Ignore在执行save操作时，标有此注解的字段会被自动忽略
 */
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Ignore{
}
