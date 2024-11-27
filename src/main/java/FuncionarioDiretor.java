public class FuncionarioDiretor extends Funcionario {

    public FuncionarioDiretor(Funcionario superior) {
        listaPedidos.add(TipoPedidoAltaPrioridade.getTipoPedidoAltaPrioridade());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor";
    }
}
