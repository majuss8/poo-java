public class Email implements Seguranca {
    String nomeUsuario;
    String email;
    String senha;

    public boolean verificaAcesso(String nomeUsuario, String email, String senha){
        if (nomeUsuario.equals(this.nomeUsuario) && email.equals(this.email) && verificaSenha(senha)){
            mensagemSucesso();
            return true;
        }
        mensagemFracasso();
        return false;
    }

    @Override
    public boolean verificaSenha(String senha) {
        //if(senha.equals(this.senha)){
        //    return true;
        //}
        //return false;

        return senha.equals(this.senha);
    }

    @Override
    public void mensagemSucesso() {
        System.out.println("Login realizado com sucesso! ");
    }

    @Override
    public void mensagemFracasso() {
        System.out.println("Usuário ou senha incorretos! ");
    }
}
