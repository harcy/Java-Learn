package com.learn.initPara;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD.TYPE.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Description {
	String desc();
	String author();
	int age() default 18;

}
