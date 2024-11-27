public class TipoPedidoAltaPrioridade implements TipoPedido {

    private static TipoPedidoAltaPrioridade tipoPedidoAltaPrioridade = new TipoPedidoAltaPrioridade();

    private TipoPedidoAltaPrioridade() {}

    public static TipoPedidoAltaPrioridade getTipoPedidoAltaPrioridade() {
        return tipoPedidoAltaPrioridade;
    }
}
