import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    FuncionarioDiretor diretor;
    FuncionarioGerente gerente;
    FuncionarioAnalista analista;

    @BeforeEach
    void setUp() {
        diretor = new FuncionarioDiretor(null);
        gerente = new FuncionarioGerente(diretor);
        analista = new FuncionarioAnalista(gerente);
    }

    @Test
    void deveRetornarAnalistaParaAprovacaoPedidoBaixaPrioridade() {
        assertEquals("Analista", analista.aprovarPedido(new Pedido(TipoPedidoBaixaPrioridade.getTipoPedidoBaixaPrioridade())));
    }

    @Test
    void deveRetornarGerenteParaAprovacaoPedidoMediaPrioridade() {
        assertEquals("Gerente", analista.aprovarPedido(new Pedido(TipoPedidoMediaPrioridade.getTipoPedidoMediaPrioridade())));
    }

    @Test
    void deveRetornarDiretorParaAprovacaoPedidoAltaPrioridade() {
        assertEquals("Diretor", analista.aprovarPedido(new Pedido(TipoPedidoAltaPrioridade.getTipoPedidoAltaPrioridade())));
    }

    @Test
    void deveRetornarGerenteParaAprovacaoPedidoMediaPrioridadeComFuncionarioSuperior() {
        assertEquals("Gerente", gerente.aprovarPedido(new Pedido(TipoPedidoMediaPrioridade.getTipoPedidoMediaPrioridade())));
    }

    @Test
    void deveRetornarSemAprovacaoParaAprovacaoPedidoAltaPrioridadeComFuncionarioInferior() {
        assertEquals("Pedido não aprovado", analista.aprovarPedido(new Pedido(TipoPedidoAltaPrioridade.getTipoPedidoAltaPrioridade())));
    }

}
