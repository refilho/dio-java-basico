package edu.renan.cursojava;
public class MinhaClasse {
    public static void main (String [] args) {
        System.out.print("Ola, seja bem vindo!");
        String primeiroNome = "Renan";
        String segundoNome = "Filho";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}