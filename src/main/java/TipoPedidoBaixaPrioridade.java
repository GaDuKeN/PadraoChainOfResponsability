public class TipoPedidoBaixaPrioridade implements TipoPedido {

    private static TipoPedidoBaixaPrioridade tipoPedidoBaixaPrioridade = new TipoPedidoBaixaPrioridade();

    private TipoPedidoBaixaPrioridade() {}

    public static TipoPedidoBaixaPrioridade getTipoPedidoBaixaPrioridade() {
        return tipoPedidoBaixaPrioridade;
    }
}
