package vigenere;

public class Bloque {
    
    private String mensaje;
    private String clave;
    private String claveMod;
    private int largoMensaje;

   
    public Bloque(String mensaje, String clave)
    {
        this.mensaje = mensaje.toUpperCase();
        this.clave = clave; 
        this.largoMensaje = this.mensaje.length();
        this.calcularClaveMod();
    }
    
     public void setMensaje(String mensaje) {
        this.mensaje = mensaje.toUpperCase();
    }
    public void setClave(String clave) {
        this.clave = clave;
    }
    public void setClaveMod(String claveMod) {
        this.claveMod = claveMod;
    }
    
    public String getMensaje() {
        return this.mensaje;
    }
    public String getClave() {
        return this.clave;
    }
    public String getClaveMod() {
        return this.claveMod;
    }
    public int getLargoMensaje() {
        return this.largoMensaje;
    }
    
    private void calcularClaveMod() {
        this.claveMod = "";
        int indexAux = 0;
        
        for(int i = 0; i < this.largoMensaje; i++)
        {
            if(indexAux%this.clave.length() == 0)
            {
                indexAux = 0;
            }
            
            this.claveMod += this.clave.charAt(indexAux);
            indexAux++;
        }
        this.claveMod = claveMod.toUpperCase();
    }
}