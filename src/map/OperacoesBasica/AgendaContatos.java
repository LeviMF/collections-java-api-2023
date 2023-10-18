package map.OperacoesBasica;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome= agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("teste", 123221);
        agendaContatos.adicionarContato("teste", 1232212);
        agendaContatos.adicionarContato("teste2", 1232213);
        agendaContatos.adicionarContato("teste3", 1232214);
        agendaContatos.adicionarContato("teste4", 1232215);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("teste2");

        agendaContatos.exibirContatos();
    }

}
