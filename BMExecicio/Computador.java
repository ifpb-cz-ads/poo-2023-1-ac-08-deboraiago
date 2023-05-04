public class Computador extends Equipamento {
    private String processador;
    private String memoriaRam;
    private String memoria;
   
    

    public Computador(String nome, int codigo, String processador, String memoriaRam, String memoriaTom) {
        super(nome , codigo);
        this.processador = processador;
        this.memoriaRam = memoriaRam;
        this.memoria = memoriaTom;   
    }
    public Computador (){
        
    }

  
    public String getProcessador() {
        return processador;
    }
    public String getMemoriaRam() {
        return memoriaRam;
    }
    public String getMemoriaTom() {
        return memoria;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public void setMemoriaRam(String memoriaRam) {
        this.memoriaRam = memoriaRam;
    }
    public void setMemoriaTom(String memoria) {
        this.memoria = memoria;
    }
    @Override
    public String toString() {
        return "Computador [nome="+ getNome() +" codigo=" + getCodigo() +" processador=" + processador + ", memoriaRam=" + memoriaRam + ", memoria=" + memoria + "]";
    } 
}
