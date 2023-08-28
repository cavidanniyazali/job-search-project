package com.practice.jobsearchproject.config;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GcpStorageConfig {

    @Bean
    public Storage gcpStorage(GoogleCredentials customGoogleCredentials) {
        StorageOptions storageOptions = StorageOptions.newBuilder()
                .setCredentials(customGoogleCredentials)
                .build();

        return storageOptions.getService();
    }
}
