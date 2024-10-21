public class Conta {
    float saldo;
    public void sacar(float valor) throws SaldoInsuficienteExeption { // para disparar sua classe de exceção
        if (valor > saldo){
            throw new SaldoInsuficienteExeption();
        } else {
            saldo -= valor;
        }
    }
}
