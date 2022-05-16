package SRC.Model.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import SRC.Model.VO.*;;

public class UsuarioDAO <VO extends UserVO> extends PessoaDAO <VO>
/*
 * declaração de classe para a criação de Usuarios DAO implementados a MariaDB
 */
{
    /* método de inserção de Usuarios */
    @Override
    public void Inserir(VO vo) throws SQLException {
        super.Inserir(vo);
        String sql = "insert into usuario (login, senha, tipo, id_user_pessoa) values (?,?,?,?)";
        PreparedStatement psts;
        psts = getConnection().prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        psts.setString(1, vo.getLogin());
        psts.setString(2, vo.getSenha());
        psts.setInt(3, vo.getTipo());
        psts.setLong(4, vo.getId_pessoa());
        int affectedRows = psts.executeUpdate();

        if (affectedRows == 0) {
            throw new SQLException("A inserção falhou. Nenhuma linha foi alterada.");
        }
        
        ResultSet generatedKeys = psts.getGeneratedKeys(); //Id retornado da tabela
        
        if (generatedKeys.next()) { //caso nenhum seja id retornado, será inserido ao usuário, caso não, a falha é exibida
            vo.setIdUser(generatedKeys.getLong(1));
        } else {
            throw new SQLException("A inserção falhou. nenhum id foi retornado.");
        }
    }

    /* método de remoção de Usuarios */
    @Override
    public void Deletar(VO vo) throws SQLException {
        String sql = "delete from usuario where id_user = ?"; /* comando de remoção em SQL para o DB. */
        PreparedStatement ptst;
        ptst = getConnection().prepareStatement(sql);
        ptst.setLong(1, vo.getIdUser());
        ptst.executeUpdate();
        super.Deletar(vo);
    }

    /* método de listagem de Usuarios */
    @Override
    public ResultSet Listar() throws SQLException {
        String sql = "select * from usuario"; /* comando de listagem em SQL para o DB. */
        Statement st;
        ResultSet rs = null;

        st = getConnection().prepareStatement(sql);
        rs = st.executeQuery(sql);
        return rs;
    }

    /* método de listagem por nome */
    public ResultSet ListarPorNome(VO vo) throws SQLException {
        String sql = "select * from Pessoa left join usuario on pessoa.id = usuario.id_user_pessoa where pessoa.nome = ? ";
        PreparedStatement psts;
        ResultSet rs = null;

        psts = getConnection().prepareStatement(sql);
        psts.setString(1, vo.getNome());
        rs = psts.executeQuery();
        return rs;
    }
    
    /* método de listagem por Id */
    @Override
    public ResultSet ListarPorId(VO vo) throws SQLException {
        String sql = "select * from usuario where id_user = ?";
        PreparedStatement psts;
        ResultSet rs = null;

        psts = getConnection().prepareStatement(sql);
        psts.setLong(1, vo.getIdUser());
        rs = psts.executeQuery();
        return rs;
    }

    public ResultSet ListarPorLoginSenha(UserVO vo) throws SQLException {
        String sql = "select * from Pessoa left join usuario on pessoa.id = usuario.id_user_pessoa where usuario.login = ? and usuario.senha = ? ";
        PreparedStatement psts;
        ResultSet rs;

        psts = getConnection().prepareStatement(sql);
        psts.setString(1, vo.getLogin());
        psts.setString(2, vo.getSenha());
        rs = psts.executeQuery();
        return rs;
    }

    
    /* comando de atualização em SQL. */
    @Override
    public void Atualizar(VO vo) throws SQLException {
        String sql = "update Pessoa set nome = ? where id = ?";
        PreparedStatement psts;
        psts = getConnection().prepareStatement(sql);
        psts.setString(1, vo.getNome());
        psts.setLong(2, vo.getId_pessoa());
        psts.executeUpdate();
    }

    public ResultSet buscarPorLogin(UserVO vo) throws SQLException {
        String sql = "select * from Pessoa left join usuario on pessoa.id = usuario.id_pessoa where usuario.login = ? ";
        PreparedStatement psts;
        ResultSet rs = null;

        psts = getConnection().prepareStatement(sql);
        psts.setString(1, vo.getLogin());
        rs = psts.executeQuery();
        return rs;
    };
}
