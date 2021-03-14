import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Eventos implements ActionListener, KeyListener{

    private ViewMain calcFactorK;
    int resultado;

    public Eventos(ViewMain calcFactorK) {
        this.calcFactorK = calcFactorK;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == calcFactorK.getCalcular()) {

            try {

                float perdidaCarga = Float.parseFloat(calcFactorK.getPascales().getText());
                float caudal = Float.parseFloat(calcFactorK.getCaudal().getText());

                resultado = (int) (caudal / Math.pow(perdidaCarga, 0.97));

                calcFactorK.getFactorK().setText(Integer.toString(resultado));

                calcFactorK.getCaudal().setText("");
                calcFactorK.getPascales().setText(" ");


            } catch (Exception g) {

                calcFactorK.getCaudal().setText("");
                calcFactorK.getPascales().setText(" ");
                calcFactorK.getFactorK().setText(" "); 
            }
        }  
    }

    @Override
    public void keyTyped(KeyEvent e) {
 
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode()==KeyEvent.VK_ENTER){

            try {

                float perdidaCarga = Float.parseFloat(calcFactorK.getPascales().getText());
                float caudal = Float.parseFloat(calcFactorK.getCaudal().getText());

                resultado = (int) (caudal / Math.pow(perdidaCarga, 0.97));

                calcFactorK.getFactorK().setText(Integer.toString(resultado));

                calcFactorK.getCaudal().setText("");
                calcFactorK.getPascales().setText(" ");


            } catch (Exception g) {

                calcFactorK.getCaudal().setText("");
                calcFactorK.getPascales().setText(" ");
                calcFactorK.getFactorK().setText(" "); 
            }   
        }  
    }
}
