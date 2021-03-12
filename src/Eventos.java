import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Eventos implements ActionListener{

    private ViewMain calcFactorK;

    public Eventos(ViewMain calcFactorK) {
        this.calcFactorK = calcFactorK;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        int resultado;

        if (e.getSource() == calcFactorK.getCalcular()) {

            try {
                float perdidaCarga = Float.parseFloat(calcFactorK.getPascales().getText());
                float caudal = Float.parseFloat(calcFactorK.getCaudal().getText());

                resultado = (int) (caudal / Math.pow(perdidaCarga, 0.97));

                calcFactorK.getFactorK().setText(Integer.toString(resultado));


            } catch (Exception g) {
                g.printStackTrace();
            }
        }
        
    }

    
    

}
