import br.com.dio.desafio.dominio.Curso;
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

        System.out.println(curso1.getCargaHoraria());
        System.out.println(curso2.getCargaHoraria());
    }
}