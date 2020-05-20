package app;

public class Transporte {

private int velocidadMax;
private String descripcion;
private int gastoDeEnergiaMagica;

public Transporte(int velocidadMax, String descripcion, int gastoDeEnergiaMagica) {
    this.velocidadMax = velocidadMax;
    this.descripcion = descripcion;
    this.gastoDeEnergiaMagica = gastoDeEnergiaMagica;
}

public Transporte(){}

public int getVelocidadMax() {
    return velocidadMax;
}

public void setVelocidadMax(int velocidadMax) {
    this.velocidadMax = velocidadMax;
}

public String getDescripcion() {
    return descripcion;
}

public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
}

public int getGastoDeEnergiaMagica() {
    return gastoDeEnergiaMagica;
}

public void setGastoDeEnergiaMagica(int gastoDeEnergiaMagica) {
    this.gastoDeEnergiaMagica = gastoDeEnergiaMagica;
}


}