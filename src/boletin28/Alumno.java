
package boletin28;

import javax.swing.JOptionPane;

public class Alumno {
    private String nome;
    private int nota;
    private String enderezo;
    
    public Alumno() {
    }   

    public Alumno(String nome, int nota, String enderezo) {
        this.nome = nome;
        this.nota = nota;
        this.enderezo = enderezo;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public void ver(){
        Enderezo e = new Enderezo();
        e.amosar();
    }

    @Override
    public String toString() {
        return "nome=" + nome + ", nota=" + nota + ", enderezo=" + enderezo;
    }
    
    class Enderezo{
        private String rua;
        private int numero;

        public Enderezo() {
        }
        
        public void setRua(String rua) {
            this.rua = rua;
        }

        public void amosar(){
            Alumno a = new Alumno();
            Enderezo e = new Enderezo();
            System.out.println(a.toString()+e.toString());
            a.setNota(nota = Integer.parseInt(JOptionPane.showInputDialog("Cambiar nota")));
            e.setRua(rua = JOptionPane.showInputDialog("Novo enderezo"));
            System.out.println(a.toString()+e.toString());
        }

        @Override
        public String toString() {
            return "rua=" + rua + ", numero=" + numero;
        }
             
    }
 
}
