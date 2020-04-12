package game.equipamento;

public abstract class Bota {
     private int forca;
     private int agilidade;
     private int inteligencia;

     public Bota(int forca, int agilidade, int inteligencia) {
          this.forca = forca;
          this.agilidade = agilidade;
          this.inteligencia = inteligencia;
     }

     public int getForca() {
          return forca;
     }

     public int getAgilidade() {
          return agilidade;
     }

     public int getInteligencia() {
          return inteligencia;
     }
}
