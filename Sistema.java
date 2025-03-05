import java.util.ArrayList;

public class Sistema {
    private ArrayList<Cliente> clientes;

    public Sistema() {
        this.clientes = new ArrayList<>();
    }

    
    public void adicionar(String nome, String sobrenome, String senha, String email) {
    	Cliente cliente = new Cliente(nome, sobrenome, senha, email);
        this.clientes.add(cliente);
        System.out.println("Cliente adicionado: " + cliente.getNome() + " " + cliente.getSobrenome());
    }
    
    //Listando
    public void listar() {
    	if (clientes.isEmpty()) {
    		System.out.println("Nenhum cliente foi encontrado.");
    	}
    	else {
	    	for (Cliente cliente : clientes) {
	   			System.out.println(cliente);
	   		}
    	}
  
    }
    
    //Atualiza dados pesquisando por email
    public void atualizar(String emailBusca, String nome, String sobrenome, String senha, String email) {
    	boolean encontrado = false;
    	
    	for (Cliente cliente : clientes) {
    		if (cliente.getEmail().equals(emailBusca)) {
    			cliente.setNome(nome);
    			cliente.setSobrenome(sobrenome);
    			cliente.setSenha(senha);
    			cliente.setEmail(email);
    			System.out.println("Cliente atualizado: " + cliente);
    			encontrado = true; 
    			break; 
    		}
    	}
    	if(!encontrado) {    		
    		System.out.println("Email do cliente não encontrado: " + emailBusca);
    	}
    }
    
    //Remover pesquisando o nome
    public void remover(String nome) {
    	if(clientes.removeIf(cliente -> cliente.getNome().equals(nome))) {
    		System.out.println("Cliente: " + nome + " removido");
    	}
    	else {
    		System.out.println("Cliente: " + nome + " não encontrado.");
    	}
    }
}
    
    