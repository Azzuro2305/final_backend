package org.project.final_backend;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import org.modelmapper.ModelMapper;
import org.project.final_backend.configuration.CRUDLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;

import javax.annotation.PostConstruct;
import java.io.*;
import java.time.chrono.IsoChronology;

@SpringBootApplication
@EnableCaching
public class FinalBackendApplication {
	public static void main(String[] args) {
		CRUDLoader crudLoader = new CRUDLoader();
		InputStream serviceAccount = crudLoader.getResourceAsStream("serviceAccountKey.json");

		try {
			FirebaseOptions options = new FirebaseOptions.Builder()
					.setCredentials(GoogleCredentials.fromStream(serviceAccount))
					.setDatabaseUrl("https://sh-app-338813-default-rtdb.firebaseio.com")
					.build();

			if (FirebaseApp.getApps().isEmpty()) {
				FirebaseApp.initializeApp(options);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		SpringApplication.run(FinalBackendApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
