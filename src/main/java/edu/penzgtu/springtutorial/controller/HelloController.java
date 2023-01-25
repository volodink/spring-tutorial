package edu.penzgtu.springtutorial.controller;

import edu.penzgtu.springtutorial.dto.HelloDTO;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.tags.Tags;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name = "hello", description = "hello controller")
public class HelloController {
    @GetMapping("/hello")
    @Operation(summary = "Returns name or World")
    public HelloDTO hello(@RequestParam(value = "name", defaultValue = "World") String name) {
        HelloDTO helloDTO = new HelloDTO();
        helloDTO.setMessage(name);
        return helloDTO;
    }

    @GetMapping("/")
    @Operation(summary = "Returns text")
    public String root() {
        return String.format("{\"param\": \"Hello!\"}");
    }
}
