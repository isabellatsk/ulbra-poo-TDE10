package test.java;
import main.java.ContaBancaria;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContaBancariaTest {
    @Test
    void deveCriarContaComSaldoInicial() {
        ContaBancaria conta = new ContaBancaria(100);
        assertEquals(100, conta.consultarSaldo());
    }

    @Test
    void deveDepositarValor() {
        ContaBancaria conta = new ContaBancaria(100);
        conta.depositar(50);
        assertEquals(150, conta.consultarSaldo());
    }

    @Test
    void deveSacarValor() {
        ContaBancaria conta = new ContaBancaria(100);
        conta.sacar(40);
        assertEquals(60, conta.consultarSaldo());
    }

    @Test
    void naoDevePermitirSaqueMaiorQueSaldo() {
        ContaBancaria conta = new ContaBancaria(100);
        assertThrows(
                IllegalArgumentException.class,
                () -> conta.sacar(200)
        );
        assertEquals(100, conta.consultarSaldo());
    }
}
