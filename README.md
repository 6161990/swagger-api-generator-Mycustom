# swagger-api-generator-MyCustom

## OpenAPI and Swagger
OpenApi 는 규격(표준), Swagger 는 구현
OpenApi 규격에 대한 표편적인 사용부분을 미리 구현해둔 도구가 Swagger 라고 할 수 있을 것 같다.

이 외에도, API 스펙 정의와 테스트를 도와주는 도구로는 다음과 같은 것들이 있다.
* [SpringDocs](https://springdoc.org/)
* [PostMan](https://www.postman.com/)
* [SpringFox](https://github.com/springfox/springfox)


보통 개발은 Source First 방식으로 진행되는데, 여기에는 여러가지 단점이 있다.
이 Source First 방식의 단점에 대항하는 방식이 OpenAPI First 다.
위 도구들은 Source First 와 API First 방식 둘 다 지원한다. 
이 두 방식의 차이점은
[여기](https://happy-coding-day.tistory.com/entry/1-API-First-Design-%EC%84%A4%EA%B3%84%EC%9D%98-%EC%84%A0%EC%88%9C%ED%99%98) 에서 더 자세히 알 수 있다. 

    

-----------------------


## 📍Source First 개발
* 소스 코드를 먼저 작성 후, 소스 코드로부터 OpenAPI 문서를 생성하는 방식
* OpenAPI 도구를 이용하면 API 문서가 소스로부터 자동 생성된다.
* 프론트 작업자와 커뮤니케이션이 필요없을 때나 주요 로직 개발을 빠르게 먼저 진행해야 할 때 적합하다.   



### 사용방법 

-----
* 컨트롤러(소스)를 먼저 작성한다.
* springDocs(또는 fox) 의존관계를 추가한다.
* 애플리케이션을 실행하여 지정된 로컬 주소(http://localhost:8080/swagger-ui.html)에 접속하면 자동으로 생성된 openAPI 문서를 확인하고 다운받을 수 있다.
  * 플러그인을 통해 openAPI 문서를 생성하는 방식도 있다.
  * JSON 파일은 /v3/api-docs 로 접속, YAML 파일은 /v3/api-docs/yaml 에 접속하면 다운로드할 수 있다. 
  * 해당 파일을 통해 백엔드 작업자는 프론트 작업자와 협업한다. 
  * (근데 어찌됐든 업데이트 될 때마다 커뮤니케이션이 필요하다..)


### Spring MVC
```
dependencies {
            ...
    implementation 'org.springdoc:springdoc-openapi-ui:버전'
    implementation 'org.springdoc:springdoc-openapi-javadoc:버전'
    implementation 'org.springdoc:springdoc-openapi-security:버전'  // 필수 아님. Spring Security 가 적용돼 있을 시에만 추가하면된다.
       
    annotationProcessor 'com.github.therapi:therapi-runtime-javadoc-scribe:0.15.0' // 필수 아님. 컨트롤러에 달린 주석도 함께 openAPI 문서에 담고 싶을 때 사용하면된다. 
            ...
}
```

### Spring WebFlux
```
dependencies {
            ...
    implementation 'org.springdoc:springdoc-openapi-webflux-ui:버전'
    implementation 'org.springdoc:springdoc-openapi-webflux-javadoc:버전'
            ...
}
```

### 플러그인을 이용한 방식  
```
plugins {
          ...
    id("com.github.johnrengelman.processes") version "0.5.0"  
    id("org.springdoc.openapi-gradle-plugin") version "1.3.2" 
          ...
}

...

openApi {
    outputDir.set(file("$buildDir/openapi"))  // 생성된 파일이 저장될 위치

    // json 방식 (default)
    apiDocsUrl.set("http://localhost:8080/v3/api-docs")  
    outputFileName.set('openapi.json')  
    
    // yaml 방식
    apiDocsUrl.set("http://localhost:8080/v3/api-docs.yaml")  // 소스 코드에서 만들어진 yaml 내용
    outputFileName.set("openapi.yml")  // yaml 내용으로부터 생성되는 yaml 파일 이름
}
```

### 플러그인을 이용한 실행
gradle build 에서 openapi > generateOpenApiDocs 태스크를 실행하면 빌드 파일에서 지정한 위치에 openapi 파일이 생성된다.


   


## 📍API First 개발
* yaml 형태로 OpenAPI 문서를 작성한다. 이때, API 스펙 정의 과정이 함께 진행된다.
* 도구 활용하여 OpenAPI -> 소스 코드가 자동으로 생성된다.
* 프론트 작업자와 커뮤니케이션이 필요하고, 프론트와 백엔드 작업을 병렬적으로 진행할 때 적합하다.
* 프론트 작업자는 [prism](https://meta.stoplight.io/docs/prism/README.md)(openAPI 를 지원하는 mock 도구)를 사용해서 빠른 개발이 가능하다.

### 사용방법

-----
* openAPI 규격을 따라 yaml 파일을 작성한다. 
* codeGenerator 로 yaml -> Controller, DTO 파일을 자동으로 생성한다. 
* 애플리케이션을 실행하여 지정된 로컬 주소(http://localhost:8080/swagger-ui.html)에 접속하면 자동으로 생성된 openAPI 문서를 확인하고 다운받을 수 있다.
  * 플러그인을 통해 openAPI 문서를 생성하는 방식도 있다.
  * JSON 파일은 /v3/api-docs 로 접속, YAML 파일은 /v3/api-docs/yaml 에 접속하면 다운로드할 수 있다.
  * 해당 파일을 통해 백엔드 작업자는 프론트 작업자와 협업한다.
  * (근데 어찌됐든 업데이트 될 때마다 커뮤니케이션이 필요하다..)


### openAPI yaml 작성하기

---
* [swagger 에서 제공하는 예제](https://petstore.swagger.io/) 를 확인해보면 대충 가볍게 작성 문법을 익힐 수 있다.   
* 사진 속 링크를 클릭하면 yaml 파일 다운로드 가능하다.
* yaml 파일은 생각보다 길어지는데, 가독성이 떨어지므로 `$ref` 를 이용하여 파일 분리([방법](https://davidgarcia.dev/posts/how-to-split-open-api-spec-into-multiple-files/))를 추천한다.


### openAPI yaml -> 소스 코드

----

[swagger-codeGen](https://github.com/swagger-api/swagger-codegen)
* [openApi-generator](https://github.com/OpenAPITools/openapi-generator)와 사용방식이 거의 비슷하다.
* swagger 의 애노테이션을 자동으로 생성할 수 있다. 
* 단, 자바만 지원한다.
* [gradle plugin 설정밥법](https://github.com/int128/gradle-swagger-generator-plugin)
```
plugins {
	id 'java'
	id 'org.hidetake.swagger.generator' version '2.19.2'
}

repositories {
	mavenCentral()
}

dependencies {
	implementation 'org.springframework.boot:spring-boot-starter-web:2.1.3.RELEASE'
	implementation 'io.swagger:swagger-annotations:1.6.9'
	swaggerCodegen 'io.swagger.codegen.v3:swagger-codegen-cli:3.0.36'
}

swaggerSources {
	openapi {
		inputFile = file("$rootDir/openapi.yaml")
		code {
			language = 'spring'
			configFile = file("$rootDir/config.json")
			components = ['models', 'apis']
			
			jvmArgs = ['--add-opens=java.base/java.util=ALL-UNNAMED']
		}
	}
}

compileJava.dependsOn swaggerSources.openapi.code
sourceSets.main.java.srcDir "${swaggerSources.openapi.code.outputDir}/src/main/java"
sourceSets.main.resources.srcDir "${swaggerSources.openapi.code.outputDir}/src/main/resources"
```

* 위와 같이 설정하면 gradle > Tasks > build 에 `generateSwaggerCodeAnyName` 생성되고, 이를 실행시키면 /build 에 소스코드 파일이 생성된다.   


## 📍Mock Server

---
### prism 
* openAPI yaml 파일 위치만 지정해주면 로컬에서 실행되는 mock 서버 쉽게 구동 가능
  `prism mock ~/tmp/open-api-bundled.yaml`
* yaml 파일만 프론트엔드와 공유하면 간단하게 대조 테스트을 통한 개발 가능






