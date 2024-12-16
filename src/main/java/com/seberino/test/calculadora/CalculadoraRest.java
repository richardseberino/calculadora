package com.seberino.test.calculadora;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/calculadora")
public class CalculadoraRest {


    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Response soma( SomaDTO soma)
    {
        int resultado = soma.getValor1() + soma.getValor2();
        return Response.ok(resultado).build();
    }
}
