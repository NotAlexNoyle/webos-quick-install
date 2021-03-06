package wosqi;

import java.awt.Cursor;
import java.awt.Desktop;
import java.net.URI;
import java.util.ResourceBundle;

import javax.swing.JLabel;

import org.jdesktop.application.Action;

/**
 * @author Jason Robitaille
 * @maintainer NotAlexNoyle
 */
public class About extends javax.swing.JDialog {
	
    private ResourceBundle bundle;

    public About(java.awt.Frame parent) {
    	
        super(parent);
        bundle = WebOSQuickInstallApp.bundle;
        initComponents();
        getRootPane().setDefaultButton(closeButton);
        jLabel5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
    }

    @Action
    public void closeAboutBox() {
    	
        dispose();
        
    }

    // This method is called from within the constructor to initialize the form.
    // WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        closeButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        javax.swing.JLabel appVersionLabel = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);
        setName("aboutBox");
        setResizable(false);
        addKeyListener(new java.awt.event.KeyAdapter() {
        	
            public void keyPressed(java.awt.event.KeyEvent evt) {
            	
                formKeyPressed(evt);
                
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
            	
                formKeyTyped(evt);
                
            }
            
        });

        jLayeredPane1.setBackground(new java.awt.Color(192, 192, 192));
        jLayeredPane1.setName("jLayeredPane1");
        jLayeredPane1.setOpaque(true);
        javax.swing.ActionMap actionMap = org.jdesktop.application.Application.getInstance(wosqi.WebOSQuickInstallApp.class).getContext().getActionMap(About.class, this);
        closeButton.setAction(actionMap.get("closeAboutBox"));
        closeButton.setBackground(new java.awt.Color(192, 192, 192));
        closeButton.setFont(closeButton.getFont());
        closeButton.setText(bundle.getString("About.closeButton.text"));
        closeButton.setFocusable(false);
        closeButton.setName("closeButton");
        closeButton.addKeyListener(new java.awt.event.KeyAdapter() {
        	
            public void keyTyped(java.awt.event.KeyEvent evt) {
            	
                closeButtonKeyTyped(evt);
                
            }
            
        });
        
        jLayeredPane1.add(closeButton);
        closeButton.setBounds(130, 310, 90, 25);
        jLabel5.setFont(jLabel5.getFont().deriveFont((jLabel5.getFont().getStyle() | java.awt.Font.ITALIC), jLabel5.getFont().getSize() + 1));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/donate.gif")));
        jLabel5.setText(bundle.getString("About.jLabel5.text"));
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.setName("jLabel5");
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
        	
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
                jLabel5MouseClicked(evt);
                
            }
            
        });
        jLayeredPane1.add(jLabel5);
        jLabel5.setBounds(10, 120, 330, 50);
        
        JLabel jLabel7 = new javax.swing.JLabel();
        jLabel7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        jLabel7.setFont(jLabel7.getFont().deriveFont((jLabel7.getFont().getStyle() | java.awt.Font.ITALIC), jLabel7.getFont().getSize()+1));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/donate.gif")));
        jLabel7.setText(bundle.getString("About.jLabel7.text"));
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.setName("jLabel7");
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        
        jLayeredPane1.add(jLabel7);
        jLabel7.setBounds(10, 175, 330, 50);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/title.png")));
        jLabel1.setName("jLabel1");
        jLayeredPane1.add(jLabel1);
        jLabel1.setBounds(0, 0, 350, 60);

        jLabel6.setFont(jLabel6.getFont());
        jLabel6.setText(bundle.getString("About.jLabel6.text"));
        jLabel6.setName("jLabel6");
        jLayeredPane1.add(jLabel6);
        jLabel6.setBounds(20, 210, 310, 110);

        appVersionLabel.setFont(appVersionLabel.getFont().deriveFont(appVersionLabel.getFont().getStyle() | java.awt.Font.BOLD, appVersionLabel.getFont().getSize()+5));
        appVersionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        appVersionLabel.setText(bundle.getString("About.appVersionLabel.text"));
        appVersionLabel.setName("appVersionLabel");
        jLayeredPane1.add(appVersionLabel);
        appVersionLabel.setBounds(10, 50, 330, 30);

        jLabel4.setFont(jLabel4.getFont());
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(bundle.getString("About.jLabel4.text"));
        jLabel4.setName("jLabel4");
        jLayeredPane1.add(jLabel4);
        jLabel4.setBounds(20, 280, 310, 40);

        jLabel2.setFont(jLabel2.getFont().deriveFont(jLabel2.getFont().getSize()+1f));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText(bundle.getString("About.jLabel2.text"));
        jLabel2.setName("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
        	
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            	
                jLabel2MouseClicked(evt);
                
            }
            
        });
        jLayeredPane1.add(jLabel2);
        jLabel2.setBounds(10, 80, 330, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
        		
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
            
        );
        layout.setVerticalGroup(
        		
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 341, Short.MAX_VALUE)
            
        );

        pack();
        
    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        
    }//GEN-LAST:event_formKeyPressed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped

    }//GEN-LAST:event_formKeyTyped

    private void closeButtonKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_closeButtonKeyTyped

    }//GEN-LAST:event_closeButtonKeyTyped

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
    	
        try {
        	
            Desktop.getDesktop().browse(new URI("https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=7G5QLAXMVVSGY"));
            
        }
        catch(Exception e) {
        	
        	System.out.println("ERROR: Link could not be opened.");
        	
        }
        
    }//GEN-LAST:event_jLabel5MouseClicked
    
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
    	
        try {
        	
            Desktop.getDesktop().browse(new URI("https://www.paypal.me/NotAlexNoyle"));
            
        }
        catch(Exception e) {
        	
        	System.out.println("ERROR: Link could not be opened.");
        	
        }
        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        try {
        	
            Desktop.getDesktop().browse(new URI("https://github.com/JayCanuck/webos-quick-install"));
            
        }
        catch(Exception e) {
        	
        	System.out.println("ERROR: Link could not be opeend.");
        	
        }
        
    }//GEN-LAST:event_jLabel2MouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
    
}