// Data Access Object -> Banco de Dados (persistencia)

public interface InterfaceDAO {
    public void criar (int id);
    public void salvar (String nome);
    public void deletar (int id);
    public void atualizar (int id);
}
