package com.ms3.range.convert;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class Ms3TechnicalChallengeApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
    public void convertRangeShouldWorkOnOneElement() throws Exception {
        mockMvc.perform(get("/convert/range?start=1&end=1")).andExpect(status().isOk());
    }

    @Test
    public void convertRangeMustContainStart() throws Exception {
        mockMvc.perform(get("/convert/range?end=1")).andExpect(status().isBadRequest());
    }

    @Test
    public void convertRangeMustContainEnd() throws Exception {
        mockMvc.perform(get("/convert/range?start=1")).andExpect(status().isBadRequest());
    }

    @Test
    public void convertRangeMustStartGreaterThanZero() throws Exception {
        mockMvc.perform(get("/convert/range?start=0&end=200")).andExpect(status().isBadRequest());
    }

    @Test
    public void convertRangeMustEndLessThan201() throws Exception {
        mockMvc.perform(get("/convert/range?start=1&end=201")).andExpect(status().isBadRequest());
    }

    @Test
    public void convertRangeStartGreaterThanEnd() throws Exception {
        mockMvc.perform(get("/convert/range?start=29&end=20")).andExpect(status().isBadRequest());
    }

	
	


}
