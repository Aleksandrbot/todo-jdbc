package com.example.controller;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.example.TodoInMemoryApplication;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(TodoInMemoryApplication.class)
public class ToDoControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void methodTest()throws Exception{
       mockMvc.perform(get("/api/test/"))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(content().string(containsString("Test")));
    }
}
