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
import org.suren.autotest.test.page.ProjectPage;
import org.suren.autotest.web.framework.annotation.AutoField;
import org.suren.autotest.web.framework.annotation.AutoModule;

/**
 * @author suren
 * @date 2017年7月7日 下午6:03:14
 */
@AutoModule(name = "项目管理")
public class ProjectModule
{
	@AutoField
	private ProjectPage page;
	@AutoField
	private CommonPage commonPage;
	
	public void addProject()
	{
		page.getAddBut().click();
        commonPage.getSkipBut().click();
        
		page.getDemoSelector().selectByIndex(1);
	}

	/**
	 * @return the page
	 */
	public ProjectPage getPage()
	{
		return page;
	}

	/**
	 * @param page the page to set
	 */
	public void setPage(ProjectPage page)
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
