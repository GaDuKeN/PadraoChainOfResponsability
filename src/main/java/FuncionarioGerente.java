public class FuncionarioGerente extends Funcionario {

    public FuncionarioGerente(Funcionario superior) {
        listaPedidos.add(TipoPedidoMediaPrioridade.getTipoPedidoMediaPrioridade());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente";
    }
}
