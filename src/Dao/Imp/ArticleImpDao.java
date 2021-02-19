package Dao.Imp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dao.ArticleDao;
import Database.DbConnect;
import Model.Article;

public class ArticleImpDao implements ArticleDao{
	Connection dbLink;
	@Override
	public Article save(Article a) throws ClassNotFoundException, SQLException {
		dbLink = DbConnect.getConnect();
		try {
			PreparedStatement ps = dbLink.prepareStatement("INSERT INTO article (nom,price) VALUES (?,?)");
			ps.setString(1, a.getNom());
			ps.setInt(2, a.getPrice());
			ps.executeUpdate();
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return a;
	}
	@Override
	public List<Article> getAllArticle() throws ClassNotFoundException, SQLException {
		List <Article> allarticle = new ArrayList<Article>();
		dbLink = DbConnect.getConnect();
		try {
			PreparedStatement ps = dbLink.prepareStatement
					("SELECT * FROM Article");
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Article a = new Article();
				a.setId(rs.getInt("id"));
				a.setNom(rs.getString("nom"));
				a.setPrice(rs.getInt("price"));
				allarticle.add(a);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return allarticle;
	}
	@Override
	public List<Article> articleMc(String mc) throws ClassNotFoundException, SQLException {
		List <Article> articles = new ArrayList<Article>();
		dbLink = DbConnect.getConnect();
		try {
			PreparedStatement ps = dbLink.prepareStatement
					("SELECT * FROM Article WHERE nom LIKE ?");
			ps.setString(1, mc);
			ResultSet rs=ps.executeQuery();
			while(rs.next()) {
				Article a = new Article();
				a.setId(rs.getInt("id"));
				a.setNom(rs.getString("nom"));
				a.setPrice(rs.getInt("price"));
				articles.add(a);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return articles;
	}

	@Override
	public Article getArticle(int id) throws ClassNotFoundException, SQLException {
		
		Connection dbLink=DbConnect.getConnect();
		
	    Article a = new Article();
       try {
		PreparedStatement ps= dbLink.prepareStatement("select * from article where id = ?");
		ps.setLong(1, id);
		ResultSet rs = ps.executeQuery();
		if  (rs.next()) {
			
			a.setId(rs.getInt("id"));
			a.setNom(rs.getString("nom"));
			a.setPrice(rs.getInt("price"));
		}
			
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
		return a;
}

	@Override
	public Article update(Article a) throws ClassNotFoundException, SQLException {
		Connection dbLink=DbConnect.getConnect();
	       try {
	    	  
	    	String q = "UPDATE article SET nom=?, price=? WHERE id=?";
	    	
			PreparedStatement ps= dbLink.prepareStatement(q);
			ps.setString(1, a.getNom());
			ps.setInt(2, a.getPrice());
			ps.setInt(3, a.getId());

			ps.executeUpdate();
					
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return a;
	}

	@Override
	public void deleteArticle(int id) throws ClassNotFoundException, SQLException {
		 Connection dbLink=DbConnect.getConnect();
	       try {
			PreparedStatement ps= dbLink.prepareStatement("DELETE FROM article WHERE id = ?");
			ps.setLong(1, id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}


}
