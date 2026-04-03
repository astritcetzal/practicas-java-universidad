public class Estudiante {
        private Certificado certificado;
        private String nombre;

        
        public Estudiante (String nombre, String nombreCurso, String duracion){
                this.nombre= nombre;
                Certificado c1=  new Certificado(nombreCurso, duracion);

        }
}

class Certificado {
        private String nombreCurso;
        private String duracion;

        public Certificado (String nombreCurso, String duracion){
                this.nombreCurso= nombreCurso;
                this.duracion= duracion;
        }

}
