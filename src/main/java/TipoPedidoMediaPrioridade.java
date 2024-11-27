public class TipoPedidoMediaPrioridade implements TipoPedido {

    private static TipoPedidoMediaPrioridade tipoPedidoMediaPrioridade = new TipoPedidoMediaPrioridade();

    private TipoPedidoMediaPrioridade() {}

    public static TipoPedidoMediaPrioridade getTipoPedidoMediaPrioridade() {
        return tipoPedidoMediaPrioridade;
    }
}
