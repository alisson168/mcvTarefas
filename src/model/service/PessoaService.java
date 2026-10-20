package model.service;
import model.entity.Pessoa;
import java.util.HashSet;
import java.util.Set;

public class PessoaService {
    private static int id =1;
    Set<Pessoa> bancoDeDados = new HashSet<>();

    public static void criarTarefa() {
    }

    //CRUD

    public void criar(){
        Pessoa p = new Pessoa();
        p.setId(id++);
        p.setNome(IO.readln("Digite seu nome: "));
        p.getEmail(IO.readln("Digite seu e-mail: "));
        p.getSenha(IO.readln("Digite sua senha: "));
        bancoDeDados.add(p);
    }

    

}
