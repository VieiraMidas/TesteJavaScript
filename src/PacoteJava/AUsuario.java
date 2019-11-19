
package PacoteJava;

public class AUsuario {
 
    private String usuario;
    private String senha;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public AUsuario(String usuario) {
        this.usuario = usuario;
    }

    public AUsuario() {
    }
    
    
}
