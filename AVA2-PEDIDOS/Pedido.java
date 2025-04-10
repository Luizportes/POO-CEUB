import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String id;
    private LocalDateTime data;
    private Vendedor vendedor;
    private Cliente cliente;
    private StatusPedido status;
    private List<ItemPedido> itens;
    private double desconto;

    public Pedido(String id, Vendedor vendedor, Cliente cliente) {
        this.id = id;
        this.data = LocalDateTime.now();
        this.vendedor = vendedor;
        this.cliente = cliente;
        this.status = StatusPedido.Novo;
        this.itens = new ArrayList<>();
        this.desconto = 0;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public void removerItem(ItemPedido item) {
        itens.remove(item);
    }

    public void aplicarDesconto(double valor) {
        this.desconto = valor;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.getSubtotal();
        }
        return total - desconto;
    }

    public void mudarStatus(StatusPedido novoStatus) {
        this.status = novoStatus;
    }

    public String getId() {
        return id;
    }

    public LocalDateTime getData() {
        return data;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public double getDesconto() {
        return desconto;
    }
}