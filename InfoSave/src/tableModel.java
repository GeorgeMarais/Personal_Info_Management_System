//George Marais Gr12 IT PAT - Infosave
import javax.swing.Icon;
import javax.swing.table.AbstractTableModel;

//creates class tableModel
public class tableModel extends AbstractTableModel{

    private String[] columns;
    private Object[][] rows;

    public tableModel() {}
    
    public tableModel(Object[][] data, String[] columnsName) {
        
        this.columns = columnsName;
        this.rows = data;
    }
    
    public Class getColumn(int col){
        
        //the table has 9 columns
        if(col == 8){
            
            return Icon.class;
        }
        else{
            return getValueAt(0, col).getClass();
        }
    }
    
    @Override
    public int getRowCount() {
        return this.rows.length;
    }

    @Override
    public int getColumnCount() {
        return this.columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return this.rows[rowIndex][columnIndex];
    }
    
    @Override
    public String getColumnName(int col){
        
        return this.columns[col];
    }
    
}
