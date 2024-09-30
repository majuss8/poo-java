public class Conta implements Seguranca{
    String cpf;
    String senha;
    float saldo;

    public void saca(float valor, String senha) {
        if (verificaSenha(senha)){
            saldo -= valor;
            mensagemSucesso();
        } else {
            mensagemFracasso();
        }
    }
    public void deposita(float valor, String senha) {
        if (verificaSenha(senha)){
            saldo += valor;
            mensagemSucesso();
        } else {
            mensagemFracasso();
        }
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
        System.out.println("Operação realizada com sucesso!");
    }

    @Override
    public void mensagemFracasso() {
        System.out.println("Senha incorreta!");
    }
}
