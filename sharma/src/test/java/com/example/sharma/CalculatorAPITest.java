package com.example.sharma;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.sharma.entity.Calculator;
import com.example.sharma.service.CalculatorService;

@RunWith(SpringRunner.class)
@WebMvcTest
public class CalculatorAPITest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private CalculatorService calcService;

    @Test
    public void findAll() throws Exception {
        Calculator calc = new Calculator();

        List<Calculator> records = Arrays.asList(calc);
        given(calcService.findAll()).willReturn(records);

        this.mockMvc.perform(get("/records"))
                .andExpect(status().isOk())
                .andExpect(content().json("[{'id': 1,'fNumber': '20';'SNumber': '30';'result':'50';'operator':'+'}]"));
    }
}