public class MatriculaDuplicadaException extends Exception{
    private String matricula;
    public  MatriculaDuplicadaException(String matricula){
        super("La matricula ya está registrda: " + matricula);
        this.matricula = matricula;
        
    }
    public String getMatricula(){
        return matricula;
     }

}//tema 1: excepciones personalizadas
