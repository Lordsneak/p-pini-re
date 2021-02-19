package Dao;

import java.sql.SQLException;
import java.util.List;

import Model.Article;

public interface ArticleDao {

	public Article save(Article a) throws SQLException, ClassNotFoundException;
	public List<Article> articleMc(String mc) throws ClassNotFoundException, SQLException;
	public Article getArticle(int id) throws ClassNotFoundException, SQLException;
	public List<Article> getAllArticle() throws ClassNotFoundException, SQLException;
	public Article update(Article a) throws ClassNotFoundException, SQLException;
	public void deleteArticle(int id) throws ClassNotFoundException, SQLException;
	
}
