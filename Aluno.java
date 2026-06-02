public class Aluno {
    private String nome;
    @SuppressWarnings("FieldMayBeFinal")
    private String matricula;
    private String curso;
    private final double nota1;
    @SuppressWarnings("FieldMayBeFinal")
    private double nota2;

    public Aluno(String nome, String matricula, String curso, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getCurso() {
        return curso;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public boolean aprovado() {
        return calcularMedia() >= 7;
    }
}