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
package com.adapterj.ext.io;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;

public class AdapterJObjectInputStream extends ObjectInputStream {

	protected ClassLoader _classLoader = getClass().getClassLoader();

	public AdapterJObjectInputStream(InputStream in) throws IOException {
		super(in);
	}

	public AdapterJObjectInputStream(InputStream in, ClassLoader classLoader) throws IOException {
		super(in);
		
		_classLoader = classLoader;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.io.ObjectInputStream#resolveClass(java.io.ObjectStreamClass)
	 */
	@Override
	protected Class<?> resolveClass(ObjectStreamClass desc) throws IOException, ClassNotFoundException {
		final String className = desc.getName();
		try {
			return Class.forName(className, false, _classLoader);
		} catch (ClassNotFoundException e) {
			return super.resolveClass(desc);
		}
	}
}
