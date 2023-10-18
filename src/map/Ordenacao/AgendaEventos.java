package map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventoMap;

    public AgendaEventos() {
        this.eventoMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventoMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        System.out.println(eventoTreeMap);
    }

    public void obterProximoEvento(){
       /*Set<LocalDate> dateset = eventoMap.keySet();
       Collection<Evento> values = eventoMap.values();*/
       //eventoMap.get();

        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventoMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O prximo evento: " + entry.getValue() + " acontecerá na data " + entry.getKey());
                break;
            }
        }

    }

    public static void main(String[] args) {
        AgendaEventos agenda = new AgendaEventos();
        agenda.adicionarEvento(LocalDate.of(2023,12,15),"Evento 1", "atracao 1");
        agenda.adicionarEvento(LocalDate.of(2022, Month.AUGUST,13),"Evento 2", "atracao 2");
        agenda.adicionarEvento(LocalDate.of(2021,10,12),"Evento 3", "atracao 3");
        agenda.adicionarEvento(LocalDate.of(2020,12,14),"Evento 4", "atracao 4");
        agenda.adicionarEvento(LocalDate.of(2023,11,1),"Evento 5", "atracao 5");

        agenda.exibirAgenda();

        agenda.obterProximoEvento();
    }
}
