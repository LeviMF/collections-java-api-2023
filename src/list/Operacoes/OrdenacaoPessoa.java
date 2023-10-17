package list.Operacoes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    public void adcionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenadoPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adcionarPessoa("nome 1", 20, 1.36);
        ordenacaoPessoa.adcionarPessoa("nome 2", 26, 1.66);
        ordenacaoPessoa.adcionarPessoa("nome 3", 28, 1.76);
        ordenacaoPessoa.adcionarPessoa("nome 4", 8, 1.50);
        ordenacaoPessoa.adcionarPessoa("nome 5", 26, 1.46);

        System.out.println(ordenacaoPessoa.ordenadoPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
        System.out.println(ordenacaoPessoa.pessoaList);
    }
}
