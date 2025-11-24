package com.at1_t2_springboot.concessionaria.controller;

import com.at1_t2_springboot.concessionaria.model.Carro;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(CarroController.class)
public class CarroControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void deveListarCarros() throws Exception {
        mockMvc.perform(get("/carros"))
                .andExpect(status().isOk());
    }

    @Test
    void deveBuscarCarroPorId() throws Exception {
        mockMvc.perform(get("/carros/1"))
                .andExpect(status().isOk());
    }

    @Test
    void deveCriarCarro() throws Exception {
        String json = """
        {
            "id": 3,
            "modelo": "Onix",
            "marca": "Chevrolet",
            "preco": 90000
        }
        """;

        mockMvc.perform(post("/carros")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.modelo").value("Onix"));
    }
}
