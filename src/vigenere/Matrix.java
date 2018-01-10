package vigenere;

public class Matrix {
    
    private String data;
    private int nRow;
    private int nCol;

    
    public Matrix(String data, int nRow, int nCol) {
       this.data = data;
       this.nRow = nRow;
       this.nCol = nCol;
    }
    
    public void setData(String data) {
       this.data = data;
    }
    public void setNrow(int nRow) {
       this.nRow = nRow;
    }
    public void setNcol(int nCol) {
       this.nCol = nCol;
    }

    public String getData() {
       return data;
    }
    public int getNRow() {
       return nRow;
    }
    public int getNCol() {
       return nCol;
    }
    
    public String getCell(int row, int col) {
        int posRowCol = row * this.nCol + col;
        String cell = Character.toString(this.data.charAt(posRowCol));
        return cell;
    }
    
    public int getIndiceRow(String row) {
      String rowMayus = row.toUpperCase();
      String valorCelda = "";
      int c = 0;;
      
      for (int i = 0; i < this.nRow; i++)
      {
          valorCelda = this.getCell(i, 0);
          if(valorCelda.equals(rowMayus))
          {
              c = i;
              break;
          }
      }
      
      return c;
    }
    
    public int getIndiceCol(String col) {
      String colMayus = col.toUpperCase();
      String valorCelda = "";
      int i;
      for (i=0;i < this.nCol; i++)
      {
          valorCelda = this.getCell(0,i);
          if(valorCelda.equals(colMayus)==true)
          {
              break;
          }
      }
      return i;
    }
    
    public void imprimirMatrix() {
        String aux = "";
        
        for(int i = 0; i < this.nRow; i++)
        {
            for(int j = 0; j <this.nCol; j++)
            {
                aux = this.getCell(i,j);
                System.out.print(aux +"  ");
            }
            
            System.out.println();
        }
    }
}