import DAO.UsuarioDAO;
import entity.Usuario;

public class Teste {

	public static void main(String[] args) {
		
		Usuario u = new Usuario();
		u.setCodigo(1);
		u.setNome("Matheus");
		u.setEmail("matheuscondultor@gmail.com");
		u.setTelefone("(11)98765-3456");
		
		new UsuarioDAO().cadastrarUsuario(u);
	}

}
