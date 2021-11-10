package validador_cpf;

import org.junit.Test;

import static org.junit.Assert.assertFalse;


public class test_validador_cpf {

    @Test
    public void testaIgualdadeNumero() {
        ValidaCPF testCpf = new ValidaCPF();
        assertFalse(testCpf.isCPF("11111111111"));

    }
    @Test
    public void testaTamanhoNumero() {
        ValidaCPF testCpf = new ValidaCPF();
        assertFalse(testCpf.isCPF("123456789900"));

    }
    @Test
    public void testaLetra() {
        ValidaCPF testCpf = new ValidaCPF();
        assertFalse(testCpf.isCPF("abcdeFghiJK"));

    }
    @Test
    public void testaLetraeNumero() {
        ValidaCPF testCpf = new ValidaCPF();
        assertFalse(testCpf.isCPF("123abcd45efg"));

    }
    @Test
    public void testaNull() {
        ValidaCPF testCpf = new ValidaCPF();
        assertFalse(testCpf.isCPF());
    }

    @Test
    public void testaVazio() {
        ValidaCPF testCpf = new ValidaCPF();
        assertFalse(testCpf.isCPF(""));
    }

    @Test
    public void testeGeral() {
        ValidaCPF testCpf = new ValidaCPF();
        assertFalse(testCpf.isCPF("123bg65"));

    }
}
