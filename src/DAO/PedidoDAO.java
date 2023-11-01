
package DAO;

import DTO.PedidoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Departamento Social
 */
public class PedidoDAO {
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<PedidoDTO> lista = new ArrayList<>();
    
    public void cadastrar(PedidoDTO objetopedidodto){
    String sql = "insert into caixa (nome,preco,valortotal) values(?,?,?)";
    
    conn = new ConexaoDAO().conectaBD();
    
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objetopedidodto.getNome());
            pstm.setDouble(2, objetopedidodto.getPreco());
            pstm.setDouble(3, objetopedidodto.getValorTotal());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "cadastrador com sucesso");
            pstm.close();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"PEDIDODAO" + e);
        }
    }
 public ArrayList<PedidoDTO> PesquisarPedido(){
     String sql = "select * from caixa";
     conn = new ConexaoDAO().conectaBD();
     try {
         pstm = conn.prepareStatement(sql);
         rs = pstm.executeQuery();
         
         while(rs.next()){
             PedidoDTO objetopedidodto = new PedidoDTO();
             objetopedidodto.setId(rs.getInt("id"));
             objetopedidodto.setNome(rs.getString("nome"));
             objetopedidodto.setPreco(rs.getDouble("preco"));
             objetopedidodto.setValorTotal(rs.getDouble("valortotal"));
             
             lista.add(objetopedidodto);
         }
         
     } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, "PesquisarPedido"+ e);
     }
        return lista;
 }
 

}
