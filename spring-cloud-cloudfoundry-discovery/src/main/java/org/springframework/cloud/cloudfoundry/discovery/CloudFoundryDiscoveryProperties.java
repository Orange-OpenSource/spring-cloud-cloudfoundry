/*
 * Copyright 2013-2015 the original author or authors.
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

package org.springframework.cloud.cloudfoundry.discovery;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author <A href="mailto:josh@joshlong.com">Josh Long</A>
 */
@ConfigurationProperties(prefix = "spring.cloud.cloudfoundry.discovery")
public class CloudFoundryDiscoveryProperties {

	/**
	 * URL of Cloud Foundry API (Cloud Controller).
	 */
	private String url = "https://api.run.pivotal.io";

	/**
	 * Email address of user to authenticate.
	 */
	private String email;

	/**
	 * Password for user to authenticate and obtain token.
	 */
	private String password;

	/**
	 * Flag to indicate that discovery is enabled.
	 */
	private boolean enabled = true;

	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String cloudControllerUrl) {
		this.url = cloudControllerUrl;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}