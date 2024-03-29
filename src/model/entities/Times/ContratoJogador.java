package model.entities.Times;

import java.time.LocalDate;

public class ContratoJogador {
    private LocalDate dataInicio;
    private LocalDate dataFinal;
    private Double salario;

    public ContratoJogador(){}

    public ContratoJogador(LocalDate dataInicio, LocalDate dataFinal, Double salario) {
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.salario = salario;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(LocalDate dataFinal) {
        this.dataFinal = dataFinal;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    public double valorTotal(double salario){
        return salario;
    }
}
