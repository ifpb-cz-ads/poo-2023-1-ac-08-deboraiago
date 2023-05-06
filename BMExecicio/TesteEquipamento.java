import java.util.Scanner;

public class TesteEquipamento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      

        System.out.println("digite a Marca do computador: ");
        String nomeMarca = sc.next();
        System.out.println("digite o codigo do produtor: ");
        int codigoProduto = sc.nextInt();
        System.out.println("digite o processador do computador");
        String processador = sc.next();
        System.out.println("digite o memoria ram do computador");
        String memoriaRam = sc.next();
        System.out.println("digite o memoria ssd do computador");
        String memoriaTamanho = sc.next();
        
        Equipamento equipamento = new Equipamento(nomeMarca, codigoProduto);
        Computador computador = new Computador(nomeMarca, codigoProduto, processador, memoriaRam, memoriaTamanho);
        equipamento.setNome(nomeMarca);
        computador.setNome(equipamento.getNome()) ;
       equipamento.setCodigo(codigoProduto);
       computador.setCodigo(equipamento.getCodigo());
       computador.setProcessador(processador);
       computador.setMemoriaRam(memoriaRam);
       computador.setMemoriaTom(memoriaTamanho);

       System.out.println(equipamento.toString());
       System.out.println(computador.toString());
        
        
        sc.close();
        
        


    }
}
