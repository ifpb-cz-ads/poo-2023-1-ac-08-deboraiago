/**
 * Equipamento
 */
public class Equipamento {
    
    private String nome;
    private int codigo;
    public Equipamento(String nome, int codigo) {
        super();
        this.nome = nome;
        this.codigo = codigo;
    }
    
    public Equipamento() {
    }

    public String getNome() {
        return nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

  
    
}