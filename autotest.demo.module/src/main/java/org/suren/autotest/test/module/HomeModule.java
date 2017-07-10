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

package org.suren.autotest.test.module;

import org.suren.autotest.test.page.CommonPage;
import org.suren.autotest.test.page.HomePage;
import org.suren.autotest.web.framework.annotation.AutoField;
import org.suren.autotest.web.framework.annotation.AutoModule;
import org.suren.autotest.web.framework.util.ThreadUtil;

/**
 * @author suren
 * @date 2017年7月7日 上午8:10:13
 */
@AutoModule(name = "首页")
public class HomeModule
{
	@AutoField
	private HomePage page;
	@AutoField
	private CommonPage commonPage;
	
	public void login()
	{
        page.open();
        page.getUserName().fillValue("demo");
        page.getPassword().fillValue("demo");
        page.getLoginBut().click();

        commonPage.getSkipBut().click();
        page.getDemoText().fillValue("demo text");
        ThreadUtil.silentSleep(2000);
        
        page.getToProjectListBut().click();
        commonPage.getSkipBut().click();
	}

	/**
	 * @return the page
	 */
	public HomePage getPage()
	{
		return page;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(HomePage page)
	{
		this.page = page;
	}

	/**
	 * @return the commonPage
	 */
	public CommonPage getCommonPage()
	{
		return commonPage;
	}

	/**
	 * @param commonPage the commonPage to set
	 */
	public void setCommonPage(CommonPage commonPage)
	{
		this.commonPage = commonPage;
	}
}
