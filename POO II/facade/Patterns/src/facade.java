
public class facade {
private static final String Sistema = null;
BancoDeDados banco = Sistema.obterBanco();
public void registrar(String nome, int id) {
Cliente c = Cliente.create(nome, id);
Carrinho c = Carrinho.create();
c.adicionarCarrinho();
}
public void comprar(int prodID, int clienteID) {
Cliente c = banco.selectCliente(cliente ID);
Produto p = banco.selectProduto(prodID) {
c.getCarrinho().adicionar(p);
}
public void fecharCompra(int clienteID) {
Cliente c = banco.selectCliente(clienteID);
double valor = c.getCarrinho.getTotal();
banco.processarPagamento(c, valor);
}
}