
package DTO;


public class PedidoDTO {
   private String nome;
   private double preco;
   private double ValorTotal;

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the preco
     */
    public double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(double preco) {
        this.preco = preco;
    }

    /**
     * @return the ValorTotal
     */
    public double getValorTotal() {
        return ValorTotal;
    }

    /**
     * @param ValorTotal the ValorTotal to set
     */
    public void setValorTotal(double ValorTotal) {
        this.ValorTotal = ValorTotal;
    }
}