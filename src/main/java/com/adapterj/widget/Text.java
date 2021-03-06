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
package com.adapterj.widget;

import java.io.Serializable;

import com.adapterj.annotation.ID;
import com.adapterj.annotation.GetMethod;
import com.adapterj.annotation.SetMethod;

/**
 * 
 * @author York/GuangYu DENG
 */
@ID(identity = "text")
public class Text implements Serializable {
	
	private static final long serialVersionUID = 3273138306522898784L;

	/**
	 * Constructs a HTML text node with the given text value.
	 * 
	 * @param text the given text value.
	 */
	public Text(final String text) {
		this.text = text;
	}
	
	private String text;
	
	@GetMethod(methodName = "getText", returnType = "String", returnId = "text")
	public String getText() {
		return text;
	}

	@SetMethod(methodName = "setText", parameterType = "String", parameterId = "text")
	public void setText(String text) {
		this.text = text;
	}

	public String toJSONString() {
		final StringBuffer s = new StringBuffer();
		s.append('{');
		s.append("\"text\":\"").append(text).append("\"");
		s.append('}');
		return s.toString();
	}
}
