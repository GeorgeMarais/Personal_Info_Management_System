//George Marais Gr12 IT PAT - Infosave
import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class functions {
    
    //dispaly the image to fit the label
    public ImageIcon resizePicture(String path, byte[] blob, int width, int height){
        
        ImageIcon image;
        
        if(path != null){
            image = new ImageIcon(path);
        }
        else{
            image = new ImageIcon(blob);
        }
        Image img = image.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
        ImageIcon pic = new ImageIcon(img);
        return pic;
    }
    //opens a file browser so that a user can pick a profile picture
    public String browse(JLabel lbl){
        String path = "";
        JFileChooser filec = new JFileChooser();
        filec.setCurrentDirectory(new File(System.getProperty("user.home")));
        
        //File Extension
        FileNameExtensionFilter imgFilter = new FileNameExtensionFilter("*.Images","jpg","png");
        filec.addChoosableFileFilter(imgFilter);
        
        int fileState = filec.showSaveDialog(null);
        
        //if a file is chosen
        if(fileState == JFileChooser.APPROVE_OPTION){
            
            File imgSelect = filec.getSelectedFile();
            path = imgSelect.getAbsolutePath();
            
            lbl.setIcon(resizePicture(path, null, lbl.getWidth(), lbl.getHeight()));
        }
        //if selection cancelled
        else if(fileState == JFileChooser.CANCEL_OPTION){
            
            System.out.println("No Image Selected");
        }
        return path;
    }
}
