package controller;

import model.service.PessoaService;
import model.service.TarefaService;

public class TarefaController {

    private final TarefaService tarefaService;
    public TarefaController(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    public void criarTarefa(){
        tarefaService.criarTarefa();
        IO.println("Tarefa criada com sucesso!!");
    }
    public void mostrarPessoa(){
        PessoaService.criarTarefa();
    }



}