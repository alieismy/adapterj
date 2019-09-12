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
package com.adapterj.ext.vertx;

import java.util.List;
import java.util.Map;

import io.vertx.core.http.HttpServerRequest;

import com.adapterj.widget.ParametersResolver;

public interface HttpParametersResolver<T> extends ParametersResolver<HttpServerRequest, T> {

	T getParameter(final HttpServerRequest httpRequest);

	T getParameter(final HttpServerRequest httpRequest, String charset);
	
	List<T> getParametersAsList(final HttpServerRequest httpRequest);
	
	List<T> getParametersAsList(final HttpServerRequest httpRequest, String charset);

	Map<String, T> getParametersAsMap(final HttpServerRequest httpRequest);

	Map<String, T> getParametersAsMap(final HttpServerRequest httpRequest, String charset);

}
