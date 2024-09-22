plugins {
    id("java")
    id("war")
}

group = "ru.vagapov.spring"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

java {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web:2.6.2")
    implementation("org.springframework.boot:spring-boot-starter-security:2.6.2")
}

tasks.test {
    useJUnitPlatform()
}