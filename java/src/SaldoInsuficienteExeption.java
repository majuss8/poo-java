public class SaldoInsuficienteExeption extends Exception{ // subclasse de Exception

    @Override
    public String getMessage() {
        return "Você não possui saldo sufuciente para realizar esta operação";

    }
}
