package memoryGame;

/**
 *
 * @author srb
 */
public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        myinit();
    }
    
    public final void myinit(){
        setSize(820,620);
        setResizable(false);
        gamePannel = new GamePannel();

        add(gamePannel);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    //my variables
    GamePannel gamePannel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
