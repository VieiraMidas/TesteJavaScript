
package PacoteJava;

public class TestaAtenticacao {
    public static void main(String[] args) {
        AUsuario teste = new AUsuario();
        AUsuario teste2 = new AUsuario("TestandoUsuario");
        
        teste.setUsuario("Etecia");
        teste.setSenha("etecia");
        
        System.out.println("Usuário: "+teste.getUsuario());
        System.out.println("Senha: "+teste.getSenha());
        System.out.println("Usuário: "+teste2.getUsuario());
    }
}
