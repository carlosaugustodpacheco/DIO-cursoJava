package br.com.dio.DesafioPOO.Veiculo;

public class RodarAplicacao {

    public static void main(String[] args) {

        Carro carro1 = new Carro();

        carro1.setCor("Branco");
        carro1.setModelo("Argo");
        carro1.setCapacidadeDoTanque(48);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeDoTanque());
        System.out.println(carro1.totalValorTanque(3.60));

        Carro carro2 = new Carro("Cinza", "Mercedes Benz", 66);
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeDoTanque());
        System.out.println(carro2.totalValorTanque(6.36));
    }
}
