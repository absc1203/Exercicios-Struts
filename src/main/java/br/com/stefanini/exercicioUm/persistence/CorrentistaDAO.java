package br.com.stefanini.exercicioUm.persistence;

import java.util.ArrayList;
import java.util.List;

import br.com.stefanini.exercicioUm.model.Correntista;

public class CorrentistaDAO extends DAO {

	public void createCorrentista(Correntista correntista) throws Exception {
		open();
		stmt = con.prepareStatement("insert into correntista values(null,?,?,?)");
		stmt.setString(1, correntista.getNome());
		stmt.setString(2, correntista.getEmail());
		stmt.setDouble(3, correntista.getSaldo());
		stmt.executeUpdate();
		stmt.close();

		close();

	}
	
	public List<Correntista> findAllCorrentistas() throws Exception{
		open();
		List<Correntista> listagem = new ArrayList<Correntista>(); 
		stmt = con.prepareStatement("select * from correntista");
		rs = stmt.executeQuery();
		
		while(rs.next()) {
			Correntista correntista = new Correntista(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDouble(4));
			listagem.add(correntista);
		}
		
		close();
		return listagem;
		
	}


	public static void main(String[] args) throws Exception {

		CorrentistaDAO dao = new CorrentistaDAO();
		System.out.println(dao.findAllCorrentistas());
	}

}
