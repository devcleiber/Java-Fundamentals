import domain.Veiculo;

public class MainCarros {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo();
        veiculo1.marca = "Chevrolet";
        veiculo1.modelo = "Ônix Premier";
        veiculo1.ano = 2025;

        Veiculo veiculo2 = new Veiculo();
        veiculo2.marca = "Honda";
        veiculo2.modelo = "Civic";
        veiculo2.ano = 2023;

        System.out.println("Veículo 1:");
        System.out.println("Marca: " + veiculo1.marca);
        System.out.println("Modelo: " + veiculo1.modelo);
        System.out.println("Ano: " + veiculo1.ano);

        System.out.println("Veículo 2:");
        System.out.println("Marca: " + veiculo2.marca);
        System.out.println("Modelo: " + veiculo2.modelo);
        System.out.println("Ano: " + veiculo2.ano);
    }
}