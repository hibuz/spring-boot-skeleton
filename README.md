# 🌱 Spring Boot Skeleton Project

## Step 1. Create Initial Project
![spring-initializr](.github/spring.svg)
> [Project URL](https://start.spring.io/#!type=gradle-project&language=java&platformVersion=3.0.0&packaging=jar&jvmVersion=17&groupId=com.hibuz&artifactId=account&name=spring-boot-skeleton&description=Demo%20project%20for%20Spring%20Boot&packageName=com.hibuz.account&dependencies=native,lombok,devtools,web,security,data-jpa,h2)

```groovy
dependencies {
  implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
  implementation 'org.springframework.boot:spring-boot-starter-security'
  implementation 'org.springframework.boot:spring-boot-starter-web'
  compileOnly 'org.projectlombok:lombok'
  developmentOnly 'org.springframework.boot:spring-boot-devtools'
  runtimeOnly 'com.h2database:h2'
  annotationProcessor 'org.projectlombok:lombok'
  testImplementation 'org.springframework.boot:spring-boot-starter-test'
  testImplementation 'org.springframework.security:spring-security-test'
}
```

## Building for production

### Packaging as jar

To build the final jar and optimize the example application for production, run:

```
./gradlew clean bootJar
```

To ensure everything worked, run:

```
java -jar build/libs/*.jar
```


## References
- [GitCommitEmoji.md](https://gist.github.com/parmentf/035de27d6ed1dce0b36a)