import java.time.LocalDate;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição do curso JS");
        curso2.setCargaHoraria(4);
        
        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Curso Java");
        mentoria1.setDescricao("Descrição da mentoria Java");
        mentoria1.setData(LocalDate.now());

        // System.out.println(curso1);
        // System.out.println(curso2);
        // System.out.println(mentoria1);

        Bootcamp bootcamp = new Bootcamp();

        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devAndrews = new Dev();
        devAndrews.setNome("Andrews");
        devAndrews.inscreverBootcamp(bootcamp);

        Dev devJoao = new Dev();
        devJoao.setNome("João");
        devJoao.inscreverBootcamp(bootcamp);
        
        System.out.println("Conteúdos Incritos Andrews: " + devAndrews.getConteudosInscritos());
        devAndrews.progredir();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Conteúdos Incritos Andrews: " + devAndrews.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Andrews: " + devAndrews.getConteudosConcluidos());
        System.out.println("XP: " + devAndrews.caucularTotalXP());
        
        System.out.println("===================================================================================");
        
        System.out.println("Conteúdos Incritos João: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        System.out.println("--------------------------------------------------------------------------------------");
        System.out.println("Conteúdos Incritos João: " + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João: " + devJoao.getConteudosConcluidos());
        System.out.println("XP: " + devJoao.caucularTotalXP());


    }
}
