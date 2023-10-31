
package DAO;

import DTO.PedidoDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Departamento Social
 */
public class PedidoDAO {
    Connection conn;
    PreparedStatement pstm;
    
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
}
