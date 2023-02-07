## TODO
* Spring RestController 의 가독성에 대한 것
* Spring MVC Test generator 알아보기
* api spec 과 config, openapi.yaml 위치 조정하기


## Trouble Shooting
#### 1. ResponseEntity default HttpStatus 가 501 으로 생성되는 것
  * ` return new ResponseEntity<String>(objectMapper.readValue("\"\"", String.class), HttpStatus.NOT_IMPLEMENTED);`
  * https://stackoverflow.com/questions/69688941/openapi-generator-returns-501-for-implemented-method
  * https://reflectoring.io/spring-boot-openapi/

    #### [해결하면서 배운 것]
  * config.json 옵션에서  "delegatePattern": true 설정을 주면 AnnyengApiDelegate 인터페이스가 생성되는데, 이 인터페이스를 통해 서비스 객체를 구현할 수 있다. 
  * 로직을 태워서 요청에 대한 응답을 직접 설정해줄 수 있다.  
  * 어찌되었든 직접적인 코드 수정이 필요하다. 



