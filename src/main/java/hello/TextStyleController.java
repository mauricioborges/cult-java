package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
@EnableAutoConfiguration
public class TextStyleController {

    /*
    Given I've seen all the possible text styles
    When I choose the second one
    Then the second one becomes the choosen one
     */



    public static void main(String[] args) throws Exception {
        SpringApplication.run(TextStyleController.class, args);
    }

    @RequestMapping("/textStyles")
    @ResponseBody
    List<String> textStyles() {
        return Arrays.asList("estilo um", "estilo dois");
    }

    @RequestMapping(method = POST, value="/style")
    @ResponseBody
    void postStype(String style) {

        //aqui faz algo
    }
    @RequestMapping("/choosenStyles")
    @ResponseBody
    HashMap<String, Integer> getChoosenStyles( ) {
        return null;
    }
}
