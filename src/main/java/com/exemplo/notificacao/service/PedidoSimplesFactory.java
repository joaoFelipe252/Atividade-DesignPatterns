import com.exemplo.notificacao.model.Pedido;

public class PedidoSimplesFactory implements PedidoFactory {
    @Override
    public Pedido criarPedido(String cliente, double valor) {
        System.out.println("[Factory] Novo pedido simples criado.");
        return new Pedido(cliente, valor);
    }
}