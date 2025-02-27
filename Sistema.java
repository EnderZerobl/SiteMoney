import java.util.ArrayList;

public class Sistema {
    private ArrayList<Cliente> clientes;

    public Sistema() {
        this.clientes = new ArrayList<>();
    }

    public void adicionar(String nome, String sobrenome, String senha, String email) {
        this.clientes.add(new Cliente(String nome, String sobrenome, String senha, String email));
        System.out.println("Cliente adicionado: " + cliente.getNome() + " " + cliente.getSobrenome());
    }