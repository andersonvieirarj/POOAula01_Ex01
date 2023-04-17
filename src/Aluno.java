public class Aluno {
    public String nome;
    public String disciplina;
    public String turma;
    public float nota1;
    public float nota2;
    public float nota3;
    public float nota4;
    public float media;
    // Métodos da Classe
    public void calcularMedia(){
        media = (nota1+nota2+nota3+nota4)/4;
        System.out.println("Média: " + media);
    }
    public void verificarAprovacao(){
        if (media>=7) {
            System.out.println("Você está aprovado!");
        }
        else {
            System.out.println("Você está reprovado!");
        }
    }
    public int verificarAno (int idade){
       int anoNascimento = 2023-idade;
       return anoNascimento;
    }
}
