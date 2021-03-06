/*
 * Copyright (c) 2019 York/GuangYu Deng (york.deng@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.adapterj.annotation;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 
 * @author York/GuangYu DENG
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface GetMethod {

	/**
	 * Returns the name of the get method
	 * @return the name of the get method
	 */
	public String methodName() default "get";

	/**
	 * Returns the return type of the get method
	 * @return the return type of the get method
	 */
	public String returnType() default "Object";

	/**
	 * Returns the attribute name returned by the get method
	 * @return the attribute name returned by the get method
	 */
	public String returnId() default "";
	
	/**
	 * Returns the format pattern for the attribute returned by the get method
	 * @return the format pattern for the attribute returned by the get method
	 */
	public String format() default "";
	
	/**
	 * Returns the placeholder for null
	 * @return the placeholder for null
	 */
	public String placeholderForNull() default "";
	
}
