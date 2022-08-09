import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setMentor("Regina");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Mentoria mentoria2 = new Mentoria();
        mentoria2.setTitulo("mentoria de js");
        mentoria.setMentor("Larissa");
        mentoria2.setDescricao("descrição mentoria js");
        mentoria2.setData(LocalDate.now().plusDays(4));

        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);
        System.out.println(mentoria2);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.setNome("Bootcamp Java + JS Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java + JS Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);
        bootcamp.getConteudos().add(mentoria2);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularTotalXp());

        System.out.println("-------");

        Dev devMarcela = new Dev();
        devMarcela.setNome("Marcela");
        devMarcela.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Marcela:" + devMarcela.getConteudosInscritos());
        devMarcela.progredir();
        devMarcela.progredir();
        devMarcela.progredir();
        devMarcela.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Marcela:" + devMarcela.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Marcela:" + devMarcela.getConteudosConcluidos());
        System.out.println("XP:" + devMarcela.calcularTotalXp());

    }

}