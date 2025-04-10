import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do vendedor: ");
        String nomeVendedor = sc.nextLine();
        System.out.print("Código do vendedor: ");
        String codigoVendedor = sc.nextLine();
        Vendedor vendedor = new Vendedor(nomeVendedor, codigoVendedor);

        System.out.print("Nome do cliente: ");
        String nomeCliente = sc.nextLine();
        System.out.print("CPF do cliente: ");
        String cpf = sc.nextLine();
        System.out.print("Endereço do cliente: ");
        String endereco = sc.nextLine();
        System.out.print("Telefone do cliente: ");
        String telefone = sc.nextLine();
        Cliente cliente = new Cliente(nomeCliente, cpf, endereco, telefone);

        Pedido pedido = new Pedido("P001", vendedor, cliente);

        System.out.print("Quantos itens deseja adicionar? ");
        int numItens = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numItens; i++) {
            System.out.println("Item " + (i + 1) + ":");
            System.out.print("Código do item: ");
            String codigoItem = sc.nextLine();
            System.out.print("Nome do produto: ");
            String nomeProduto = sc.nextLine();
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            System.out.print("Preço unitário: ");
            double preco = sc.nextDouble();
            sc.nextLine(); 

            ItemPedido item = new ItemPedido(codigoItem, nomeProduto, quantidade, preco);
            pedido.adicionarItem(item);
        }

        System.out.print("Deseja aplicar um desconto? (s/n): ");
        String resposta = sc.nextLine();
        if (resposta.equalsIgnoreCase("s")) {
            System.out.print("Valor do desconto: ");
            double desconto = sc.nextDouble();
            pedido.aplicarDesconto(desconto);
        }

        System.out.println("Valor total do pedido: R$ " + pedido.calcularTotal());

        System.out.println("Status atual: " + pedido.getStatus());
        System.out.print("Deseja mudar o status? (Novo, Enviado, Entregue, Cancelado): ");
        sc.nextLine();
        String novoStatus = sc.nextLine();
        pedido.mudarStatus(StatusPedido.valueOf(novoStatus));
        System.out.println("Novo status: " + pedido.getStatus());

        sc.close();
    }
}