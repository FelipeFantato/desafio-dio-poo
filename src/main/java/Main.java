import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Curso curso1 = new Curso();
        curso1.setTitulo("Programacao-JAVA");
        curso1.setCargaHoraria(200);
        curso1.setDescricao("aulas de programacao java");

        Curso curso2 = new Curso();
        curso1.setTitulo("Programacao-Python");
        curso1.setCargaHoraria(10);
        curso1.setDescricao("aulas de programacao py");


        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria-Python");
        mentoria.setCargaHoraria(10);
        mentoria.setDescricao("aulas de mentoria py");

//        System.out.println(curso1.getCargaHoraria());
//        System.out.println(curso2.getCargaHoraria());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java developer");
        bootcamp.setDescricao("Descrição do bootcamp");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Felipe");
        dev1.inscreverBootCamp(bootcamp);

        System.out.println("Conteudos inscritos "+ dev1.getConteudoInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("Conteudos Concluidos "+ dev1.getConteudosConcluidos());

        Dev dev2 = new Dev();
        dev2.setNome("Joao");
        dev2.inscreverBootCamp(bootcamp);
        System.out.println("Conteudos inscritos "+ dev2.getConteudoInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();

        System.out.println("Conteudos progrediu? "+ dev2.getConteudoInscritos());
        System.out.println("Conteudos Concluidos "+ dev2.getConteudosConcluidos());
        System.out.println("Xp: " + dev2.calcularTotalXp());
    }
}