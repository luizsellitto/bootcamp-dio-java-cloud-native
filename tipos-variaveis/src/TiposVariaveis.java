public class TiposVariaveis
{
    public static void main(String[] args) {
        byte idade = 18;
        short ano = 2025;
        int cep = 1331040883;
        long cpf = 33333333333L; //Terminar em L para saber que é tipo long
        float pi = 3.14F; //Terminar em F para saber que é tipo float
        double salario = 1234.56;

        short numeroCurto = 1;
        int numeroNormal = 2;
        short numeroCurto2 = (short) numeroNormal; //Converte o tipo mais abrangente para um tipo mais específico


        cep = 123;
        final int CEP = 134; //final deixa a variável constante

        String nome = "Luiz Augusto";
    }
}
