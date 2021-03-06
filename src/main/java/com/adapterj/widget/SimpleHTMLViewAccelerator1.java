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

import com.adapterj.test.Testable;
import com.adapterj.widget.SimpleHTMLViewAccelerator;

/**
 * 
 * @author York/GuangYu DENG
 */
class SimpleHTMLViewAccelerator1 extends SimpleHTMLViewAccelerator implements Testable {

	private static final long serialVersionUID = 7593164507465716607L;
	
	private String _test = "It's NOT working ...";
	
	// Testable methods
	
	@Override
	public void test(final String test) {
		_test = test;
	}
	
	@Override
	public String test() {
		return _test;
	}
}