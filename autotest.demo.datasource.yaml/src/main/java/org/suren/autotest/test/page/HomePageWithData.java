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

import org.suren.autotest.web.framework.annotation.AutoDataSource;

import com.surenpi.autotest.datasource.DataSourceConstants;

/**
 * @author suren
 * @date 2017年7月6日 下午7:36:16
 */
@AutoDataSource(resource = "phoenix.data.yml", type = DataSourceConstants.DS_TYPE_YAML)
public class HomePageWithData extends HomePage
{

}
