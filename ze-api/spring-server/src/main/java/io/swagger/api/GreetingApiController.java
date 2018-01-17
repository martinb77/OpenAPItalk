package io.swagger.api;

import io.swagger.model.HelloDTO;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-01-16T15:59:00.749Z")

@Controller
public class GreetingApiController implements GreetingApi {



    public ResponseEntity<HelloDTO> greetingGet() {
        HelloDTO hello = new HelloDTO();
        hello.setGreeting("Hello out there!");
        return new ResponseEntity<HelloDTO>(hello, HttpStatus.OK);
    }

}
