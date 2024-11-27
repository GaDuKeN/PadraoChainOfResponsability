public class FuncionarioAnalista extends Funcionario {

    public FuncionarioAnalista(Funcionario superior) {
        listaPedidos.add(TipoPedidoBaixaPrioridade.getTipoPedidoBaixaPrioridade());
        setFuncionarioSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Analista";
    }
}
