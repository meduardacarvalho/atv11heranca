public class Main { 

    public static void main(String[] args) { 

        Funcionario funcionario = new Funcionario("matheus", 123456, 5000.00, 7); 

        Diretor diretor = new Diretor(2); 

        Professor professor = new Professor("JOAO"); 

        Coordenador coordenador = new Coordenador("Mario"); 

        Secretario secretario = new Secretario(); 

 
 

        System.out.println("Nome do funcionário: " + funcionario.getNome()); 

        System.out.println("Número de inscrição do funcionário: " + funcionario.getNuminscrição()); 

        System.out.println("Salário do funcionário: " + funcionario.getSalario()); 

        System.out.println("Turno do funcionário: " + funcionario.getTurno()); 

 
 

        diretor.Criardesconto(); 

        diretor.EncomendarFardas(); 

        diretor.GerenciarProfessores(); 

 
 

        professor.Lecionar(); 

        professor.CriarAtividades(); 

 
 
         coordenador.Auxiliar();

        coordenador.CriarAtividades(); 

 
 

        secretario.ReceberEncomendas(); 

        secretario.Receberpagamentos(); 

    } 

} 