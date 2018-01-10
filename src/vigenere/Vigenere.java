package vigenere;

public class Vigenere {
    
    private Matrix m;
    
    public Vigenere(Matrix m) {
        this.m = m;
    }
    
    public void setM(Matrix newM) {
        this.m = newM;
    }
    public Matrix getM() {
        return this.m;
    }
    
    public String encriptar(Bloque b) {
        String mensajeEncriptado = "";
        String mensaje = b.getMensaje();
        String caracterMensaje = "";
        String clave = b.getClaveMod();
        String caracterClave = "";
        int indexMensaje = 0;
        int indexClave = 0;
        
        for(int i = 0; i < mensaje.length(); i++) {
            caracterMensaje = Character.toString(mensaje.charAt(i));
            caracterClave = Character.toString(clave.charAt(i));
            
            indexMensaje = this.m.getIndiceRow(caracterMensaje);
            indexClave = this.m.getIndiceCol(caracterClave);
            
            mensajeEncriptado += this.m.getCell(indexMensaje,indexClave);
        }
        
        return mensajeEncriptado;
    }
    
    public String desencriptar(Bloque b) {
        String mensajeOriginal = "";
        String mensajeEncriptado = b.getMensaje();
        String clave = b.getClaveMod();
        
        for(int i = 0; i < b.getLargoMensaje(); i++) {
            String caracterMensajeEncriptado = Character.toString(mensajeEncriptado.charAt(i));
            String caracterCell = "";
            String carCol = "" + clave.charAt(i);
            int indCla = m.getIndiceCol(carCol);
            String carRow = "";
            
            for(int j = 0; j < m.getNRow(); j++) {
                caracterCell = this.m.getCell(j,indCla);
                if(caracterCell.equals(caracterMensajeEncriptado) == true) {
                    carRow = this.m.getCell(j,0);
                    break;
                }
            }
            mensajeOriginal += carRow;
        }
        
        return mensajeOriginal;
    }
}