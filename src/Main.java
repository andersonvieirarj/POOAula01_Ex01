import java.util.Scanner;

/* MÓDULO II - POO
-Conceito iniciado no final dos anos 60
-Tenta trazer a "realidade" do mundo para o código
-Procura pensar o código como o mundo real
-Utiliza o conceito básico de abstração

-A gente "modela" o que seria o observado no mundo
real e define as suas características e suas ações
-A essa modelagem feita damos o nome de CLASSE
-CLASSE -> NOME, ATRIBUTOS (características - o que
   ele pode armazenar) e MÉTODOS (ações - o que ele
   pode fazer).
-Para utilizar uma classe, é preciso GERAR ou
   INSTANCIAR um objeto desta classe
   (Scanner entrada = new Scanner())
   entrada.nextInt()

EXEMPLO: Construir um programa que leia nome, turma, disciplina
e 4 notas desta disciplina. Calcule a média em um método e
verifique sua aprovação ou não em outro método. Faça o teste
na classe Principal, mostrando os resultados na tela:
 */
public class Main {
    public static void main(String[] args) {
        // Criar um objeto da classe que você quer usar
        Scanner leia = new Scanner (System.in);
        Aluno x = new Aluno();

        System.out.println("Digite seu nome: ");
        x.nome = leia.nextLine();
        System.out.println("Digite sua turma: ");
        x.turma = leia.nextLine();
        System.out.println("Digite a disciplina: ");
        x.disciplina = leia.nextLine();
        System.out.println("Digite a 1.° nota: ");
        x.nota1 = Float.parseFloat(leia.nextLine());
        System.out.println("Digite a 2.° nota: ");
        x.nota2 = Float.parseFloat(leia.nextLine());
        System.out.println("Digite a 3.° nota: ");
        x.nota3 = Float.parseFloat(leia.nextLine());
        System.out.println("Digite a 4.° nota: ");
        x.nota4 = Float.parseFloat(leia.nextLine());

        x.calcularMedia();
        x.verificarAprovacao();
        // O aluno informa sua idade e com base nela
        // o programa informa seu ano de nascimento
        // criar método com retorno e com passagem
        // de parâmetro
        System.out.println("Informe sua idade:");
        int id = leia.nextInt();
        System.out.println(x.verificarAno(id));





    }
}