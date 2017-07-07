/*
 * Copyright 2002-2007 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.suren.autotest.test.page;

import org.suren.autotest.web.framework.annotation.AutoLocator;
import org.suren.autotest.web.framework.annotation.AutoPage;
import org.suren.autotest.web.framework.selenium.WebPage;

import com.surenpi.autotest.webui.core.LocatorType;
import com.surenpi.autotest.webui.ui.Button;
import com.surenpi.autotest.webui.ui.Selector;

/**
 * @author suren
 * @date 2017年7月7日 下午6:00:31
 */
@AutoPage
public class ProjectPage extends WebPage
{
	@AutoLocator(locator = LocatorType.BY_LINK_TEXT, value = "新增")
	private Button addBut;
	
	@AutoLocator(locator = LocatorType.BY_ID, value = "demoSelect")
	private Selector demoSelector;

	/**
	 * @return the addBut
	 */
	public Button getAddBut()
	{
		return addBut;
	}

	/**
	 * @param addBut the addBut to set
	 */
	public void setAddBut(Button addBut)
	{
		this.addBut = addBut;
	}

	/**
	 * @return the demoSelector
	 */
	public Selector getDemoSelector()
	{
		return demoSelector;
	}

	/**
	 * @param demoSelector the demoSelector to set
	 */
	public void setDemoSelector(Selector demoSelector)
	{
		this.demoSelector = demoSelector;
	}
}
