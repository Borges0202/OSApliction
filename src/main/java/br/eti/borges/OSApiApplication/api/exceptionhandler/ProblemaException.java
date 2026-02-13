package br.eti.borges.OSApiApplication.api.exceptionhandler;

import java.time.LocalDateTime;

public class ProblemaException 
{
    private Integer status;
    private LocalDateTime dataHora;
    private String titulo;

    public void setStatus(Integer status) {
        this.status = status;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Integer getStatus() {
        return status;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public String getTitulo() {
        return titulo;
    }
    
}
