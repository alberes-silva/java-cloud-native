
public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("123", "Alberes");
		
		pessoa.setEndereco("Ruas das Marias");
		
		System.out.println(pessoa.getNome() + " - " + pessoa.getCpf());
	}
}
