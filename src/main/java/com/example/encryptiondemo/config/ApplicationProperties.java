package com.example.encryptiondemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

//@ConfigurationProperties
//@Configuration("applicationProperties")
public class ApplicationProperties
{
	@Value("${spring.datasource.url}")
	private String databaseUrl;
	
	@Value("${spring.datasource.user}")
	private String databaseUserName;
	
	@Value("${spring.datasource.password}")
	private String databasePassword;
	
	@Value("${spring.datasource.driverClassName}")
	private String databaseDriver;
	
	@Value("${azure.keyvault.client-id}")
	private String keyVaultClientId;
	
	@Value("${azure.keyvault.client-secret}")
	private String keyVaultClientSecret;

	public String getDatabaseUrl()
	{
		return databaseUrl;
	}

	public void setDatabaseUrl(String databaseUrl)
	{
		this.databaseUrl = databaseUrl;
	}

	public String getDatabaseUserName()
	{
		return databaseUserName;
	}

	public void setDatabaseUserName(String databaseUserName)
	{
		this.databaseUserName = databaseUserName;
	}

	public String getDatabasePassword()
	{
		return databasePassword;
	}

	public void setDatabasePassword(String databasePassword)
	{
		this.databasePassword = databasePassword;
	}

	public String getDatabaseDriver()
	{
		return databaseDriver;
	}

	public void setDatabaseDriver(String databaseDriver)
	{
		this.databaseDriver = databaseDriver;
	}
	
	public String getKeyVaultClientId()
	{
		return keyVaultClientId;
	}

	public void setKeyVaultClientId(String keyVaultClientId)
	{
		this.keyVaultClientId = keyVaultClientId;
	}

	public String getKeyVaultClientSecret()
	{
		return keyVaultClientSecret;
	}

	public void setKeyVaultClientSecret(String keyVaultClientSecret)
	{
		this.keyVaultClientSecret = keyVaultClientSecret;
	}
}