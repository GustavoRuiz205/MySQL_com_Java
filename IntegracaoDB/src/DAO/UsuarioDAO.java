package DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import conexao.Conexao;
import entity.Usuario;


public class UsuarioDAO {
	
	public void cadastrarUsuario(Usuario usuario) {
		
		String sql = "INSERT INTO Cliente (codigo, nome, email, telefone) values (?, ?, ?, ?)";
		
		PreparedStatement ps = null;
		
		try {
		ps = Conexao.getConexao().prepareStatement(sql);
		
		ps.setInt(1, usuario.getCodigo());
		ps.setString(2, usuario.getNome());
		ps.setString(3, usuario.getEmail());
		ps.setString(4, usuario.getTelefone());
		
		ps.execute();
		ps.close();
		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
			
		
	}

}
