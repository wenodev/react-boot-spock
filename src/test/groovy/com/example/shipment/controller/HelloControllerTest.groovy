package com.example.shipment.controller

import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import spock.lang.Specification
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



class HelloControllerTest extends Specification {

    private MockMvc mvc

    def setup(){
        println "called setup()"
        mvc = MockMvcBuilders.standaloneSetup(HelloController).build()
    }

    def "컨트롤러 테스트"() {
        expect : "Status is 200 and the response is 'hello spock test'"
        mvc.perform(get("/api/hello"))
        .andExpect(status().isOk())
        println "well finished 컨트롤러테스트"
    }


}
