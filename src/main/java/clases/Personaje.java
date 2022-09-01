package clases;

public class Personaje {

    String nombre;
    int poderPatada;
    int poderGolpe;
    int defensa;
    int superPoder;

    int vida;


    public Personaje() {
    }

    public Personaje(String nombre, int poderPatada, int poderGolpe, int defensa, int superPoder, int vida) {
        this.nombre = nombre;
        this.poderPatada = poderPatada;
        this.poderGolpe = poderGolpe;
        this.defensa = defensa;
        this.superPoder = superPoder;
        this.vida = vida;
    }

    public void atacar(int ataqueEnemigo){
        this.vida=this.vida - ataqueEnemigo;
    }

    public void defender(int ataqueEnemigo){
        this.vida=this.vida-(ataqueEnemigo-this.defensa);
    }

    public void aplicarSuperPoder(boolean poder) {

        if (poder == true) {
            this.poderGolpe = this.poderGolpe + this.superPoder;
        }else{
            this.defensa = this.defensa + this.superPoder;
        }

    }
}
