import com.exemplo.notificacao.model.Pedido;

public interface PedidoFactory {
    Pedido criarPedido(String cliente, double valor);
}