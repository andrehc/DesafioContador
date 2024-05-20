package Exceptions;

public class InvalidParamsException extends Throwable {
    private MinhaRuntimeExcecao() {
        super();
    }

    public static InvalidParamsException createInvalidParamsException() {
        return new InvalidParamsException();
    }

    public String parametroMaior(String mensagem) {
        //validar se parametroUm é MAIOR que parametroDois e lançar a exceção
        super("Primeiro Parâmetro é maior o segundo parâmetro");
    }

    public void MinhaRuntimeExcecao(String mensagem, Throwable causa) {
        mensagem = "O Segundo parâmetro deve ser maior que o primeiro.";
        super(mensagem, causa);
    }

    public void MinhaRuntimeExcecao(Throwable causa) {
        super(causa);
    }
}
