package MainPackage;

import java.sql.SQLException;
import java.util.List;

import Dao.Imp.ArticleImpDao;
import Model.Article;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		ArticleImpDao dp = new ArticleImpDao();
		List<Article> article = dp.getAllArticle();
		for(Article q:article) {
		System.out.println(q.toString());
		}

	}

}
