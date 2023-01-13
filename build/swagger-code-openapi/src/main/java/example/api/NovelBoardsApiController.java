package example.api;

import example.model.NovelBoard;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2023-01-13T15:23:38.972179+09:00[Asia/Seoul]")
@RestController
public class NovelBoardsApiController implements NovelBoardsApi {

    private static final Logger log = LoggerFactory.getLogger(NovelBoardsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NovelBoardsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<NovelBoard>> list() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<NovelBoard>>(objectMapper.readValue("[ {\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"novelSize\" : 6,\n  \"deleteAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"closed\" : true,\n  \"novelBoardId\" : {\n    \"id\" : \"id\"\n  },\n  \"opening\" : {\n    \"openingKey\" : {\n      \"key\" : \"key\"\n    },\n    \"title\" : {\n      \"name\" : \"name\"\n    },\n    \"content\" : {\n      \"value\" : \"value\"\n    },\n    \"writerId\" : {\n      \"id\" : \"id\"\n    }\n  },\n  \"version\" : 0,\n  \"novels\" : { }\n}, {\n  \"createdAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"novelSize\" : 6,\n  \"deleteAt\" : \"2000-01-23T04:56:07.000+00:00\",\n  \"closed\" : true,\n  \"novelBoardId\" : {\n    \"id\" : \"id\"\n  },\n  \"opening\" : {\n    \"openingKey\" : {\n      \"key\" : \"key\"\n    },\n    \"title\" : {\n      \"name\" : \"name\"\n    },\n    \"content\" : {\n      \"value\" : \"value\"\n    },\n    \"writerId\" : {\n      \"id\" : \"id\"\n    }\n  },\n  \"version\" : 0,\n  \"novels\" : { }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<NovelBoard>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<NovelBoard>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
