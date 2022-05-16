package SRC.Model.DAO;

//conexão feita com o BD por meio do JDBS para mariaDB

import java.sql.Connection; //lib para realizar a conexão do código com o DB
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public abstract class BaseDAO <VO> implements BaseInterDAO <VO>{
    private static Connection conn = null;
    private static final String url = "jdbc:mariadb://localhost:3306/GetSmash"; //url do projeto
    private static final String user = "root";
    private static final String senha = "root";
    

    public static Connection getConnection() {
    /* criação do método getConnection() para realizar a ligação entre as classes do 
       código e o MariaDB. */ 
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(url, user, senha);
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return conn;
        } else
            return conn;
    }
    public static void  closeConnection(){
        if(conn != null){
            try{
                conn.close();
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
    public abstract void Inserir (VO vo) throws SQLException;
    public abstract void Atualizar (VO vo) throws SQLException;
    public abstract void Deletar (VO vo) throws SQLException;
    public abstract ResultSet Listar() throws SQLException;
    public abstract ResultSet ListarPorId(VO vo) throws SQLException;
}
