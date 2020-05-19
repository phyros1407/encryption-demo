package com.example.encryptiondemo.config;

/*import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import com.microsoft.sqlserver.jdbc.SQLServerColumnEncryptionAzureKeyVaultProvider;
import com.microsoft.sqlserver.jdbc.SQLServerColumnEncryptionKeyStoreProvider;
import com.microsoft.sqlserver.jdbc.SQLServerConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;*/
import org.springframework.context.annotation.Configuration;

import com.microsoft.aad.adal4j.AuthenticationContext;

/*@Configuration*/
public class DataSourceConfig {
  /*  @Autowired
    private ApplicationProperties applicationProperties;

    @Bean
    public DataSource getDataSource() {
        DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();

        dataSourceBuilder.driverClassName(applicationProperties.getDatabaseDriver());
        dataSourceBuilder.url(applicationProperties.getDatabaseUrl());
        dataSourceBuilder.username(applicationProperties.getDatabaseUserName());
        dataSourceBuilder.password(applicationProperties.getDatabasePassword());

        try {
            SQLServerColumnEncryptionAzureKeyVaultProvider akvProvider = new SQLServerColumnEncryptionAzureKeyVaultProvider(applicationProperties.getKeyVaultClientId(), applicationProperties.getKeyVaultClientSecret());
            Map<String, SQLServerColumnEncryptionKeyStoreProvider> keyStoreMap = new HashMap<String, SQLServerColumnEncryptionKeyStoreProvider>();
            keyStoreMap.put(akvProvider.getName(), akvProvider);
            SQLServerConnection.registerColumnEncryptionKeyStoreProviders(keyStoreMap);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return dataSourceBuilder.build();
    }*/
}
