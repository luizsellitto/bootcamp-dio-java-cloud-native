public class MinhaClasse {
    
    public static void main(String[] args) {
        System.out.println("Primeiro Código Java");
        final String BR = "Brasil"; // final faz com que realmente seja imutável
        double PI = 3.14; //Como convenção, uma variável que não vai mudar de valor, sõa utilizadas somente letras maiúsculas

        int idade = 18;
        boolean verificador = true;

        String primeiroNome = "Luiz";
        String segundoNome = "Sellitto";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome)
    {
        return "Resultado do Método" + primeiroNome.concat(" ").concat(segundoNome);
    }
}   
