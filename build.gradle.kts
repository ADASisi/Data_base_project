plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.hibernate:hibernate-core:5.5.7.Final")
    implementation("javax.persistence:javax.persistence-api:2.2")
    implementation("org.eclipse.jetty:jetty-server:11.0.7")
    implementation("org.eclipse.jetty:jetty-servlet:11.0.7")
    implementation("org.postgresql:postgresql:42.3.1")
    testImplementation("junit:junit:4.13.2")
    implementation("javax.validation:validation-api:2.0.1.Final")
    implementation("io.swagger.core.v3:swagger-core:2.1.10")
    implementation("io.swagger.core.v3:swagger-jaxrs2:2.1.10")
    implementation("io.swagger.core.v3:swagger-annotations:2.1.10")
}

test {
    useJUnitPlatform()
}