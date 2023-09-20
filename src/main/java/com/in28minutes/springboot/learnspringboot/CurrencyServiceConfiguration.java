package com.in28minutes.springboot.learnspringboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

// Suppose there are some complex config we have to do for a service called CurrenyService that we are talking to
// some of its values are url, username & key
// currency-service.url
// currency-service.username
// currency-service.key
// and suppose we have more such values, we need to configure these values

// How can i define a property value in application.properties and make use of it in my SpringBoot App? 
// Lets show how to : 
// 1. Create a Controller to implement
// 2. Create a @ConfigurationProperties(prefix) and declare the config properties here. also make it a component
// 3. define the config values in application-dev.properties file (dev specific)

@ConfigurationProperties(prefix = "currency-service")
@Component	
// since its a component (managed by spring), we dont need its constructor. 
// to create its instance, wherever we need it, we will just use @Autowired while creating the instance.  
public class CurrencyServiceConfiguration {

	private String url;
	private String username;
	private String key;
	
	// Now that we have created these, our app understands that these 3 are configuration properties
	// Now lets configure these in application.properties

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}
