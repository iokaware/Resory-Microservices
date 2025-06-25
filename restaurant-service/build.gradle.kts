plugins {
	java
	id("org.springframework.boot") version "3.5.3"
	id("io.spring.dependency-management") version "1.1.7"
	id("io.freefair.lombok") version "8.6"
//	kotlin("jvm") version "1.9.22" // <--- ADD THIS: Core Kotlin JVM plugin. Use a recent stable version.
//	kotlin("plugin.spring") version "1.9.22" // <--- ADD THIS: Spring plugin for Kotlin. Match JVM version.
//	kotlin("kapt") version "1.9.22" // <--- UPDATE THIS: Match your kotlin("jvm") version.

}

group = "com.resory"
version = "0.0.1-SNAPSHOT"

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(21)
	}
}

repositories {
	mavenCentral()
}

extra["springCloudVersion"] = "2025.0.0"

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.cloud:spring-cloud-starter-config")
	implementation("org.springframework.cloud:spring-cloud-starter-netflix-eureka-client")
	runtimeOnly("com.h2database:h2")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testRuntimeOnly("org.junit.platform:junit-platform-launcher")

	implementation("org.springframework.boot:spring-boot-starter-actuator")


//	compileOnly("org.projectlombok:lombok:1.18.32")
//	annotationProcessor("org.projectlombok:lombok:1.18.32")

	// Lombok (Ensure kapt version matches kotlin("jvm") version)
//	compileOnly("org.projectlombok:lombok")
//	kapt("org.projectlombok:lombok") // This is correct once kapt plugin is properly set up
//	testImplementation("org.projectlombok:lombok")
//	testAnnotationProcessor("org.projectlombok:lombok")
}

dependencyManagement {
	imports {
		mavenBom("org.springframework.cloud:spring-cloud-dependencies:${property("springCloudVersion")}")
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
