/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igpa;

import static igpa.LoginPage.RemUnit;
import static igpa.LoginPage.conn;
import static igpa.LoginPage.outputarray;
import static igpa.LoginPage.outputforOptimization;
import static igpa.LoginPage.peace;
import static igpa.LoginPage.ppt;
import static igpa.LoginPage.size;
import java.awt.EventQueue;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;
import org.moeaframework.Executor;
import org.moeaframework.core.NondominatedPopulation;
import org.moeaframework.core.Solution;
import org.moeaframework.core.variable.EncodingUtils;

public class LoginPage extends javax.swing.JFrame {

    //calling connection statements
    public static Connection conn = null;
    ResultSet rs;
    PreparedStatement pt;
    Statement st = null;
    //connection statements
    public static ResultSet peace;
    public static PreparedStatement ppt;
//variables
    static double totaltranscipt;
    public static String matricnumber;
    public static double TargetCGPA;
    public static int size;
    public static double totaltranscript;
    public static double sumofremainingunits;
    public static double totalunits;
    public static double totaltranscriptunits;
    public static int[] RemUnitss;
    public static String[][] RemUnit;
    public static Object[][] outputforOptimization;
    public static String[][] outputarray;
    public static JTable table = new JTable();
    public static JFrame frame = new JFrame();
    public static int characterrating [];

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        matrictext = new javax.swing.JTextField();
        proceedbutton = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        targetcgpatext = new javax.swing.JTextField();
        businessslider = new javax.swing.JSlider();
        practicalslider = new javax.swing.JSlider();
        mathslider = new javax.swing.JSlider();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(255, 255, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("ENTER MATRIC NUMBER ");

        matrictext.setBackground(new java.awt.Color(255, 204, 255));
        matrictext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                matrictextActionPerformed(evt);
            }
        });

        proceedbutton.setBackground(new java.awt.Color(255, 102, 255));
        proceedbutton.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        proceedbutton.setText("SUBMIT");
        proceedbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proceedbuttonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("TARGET CGPA");

        targetcgpatext.setBackground(new java.awt.Color(255, 204, 255));

        businessslider.setBackground(new java.awt.Color(255, 204, 255));
        businessslider.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        businessslider.setMajorTickSpacing(1);
        businessslider.setMaximum(2);
        businessslider.setMinimum(1);
        businessslider.setMinorTickSpacing(1);
        businessslider.setPaintLabels(true);
        businessslider.setPaintTicks(true);
        businessslider.setSnapToTicks(true);
        businessslider.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        practicalslider.setBackground(new java.awt.Color(255, 204, 255));
        practicalslider.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        practicalslider.setMajorTickSpacing(1);
        practicalslider.setMaximum(2);
        practicalslider.setMinimum(1);
        practicalslider.setMinorTickSpacing(1);
        practicalslider.setPaintLabels(true);
        practicalslider.setPaintTicks(true);
        practicalslider.setSnapToTicks(true);
        practicalslider.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        mathslider.setBackground(new java.awt.Color(255, 204, 255));
        mathslider.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        mathslider.setMajorTickSpacing(1);
        mathslider.setMaximum(2);
        mathslider.setMinimum(1);
        mathslider.setMinorTickSpacing(1);
        mathslider.setPaintLabels(true);
        mathslider.setPaintTicks(true);
        mathslider.setSnapToTicks(true);
        mathslider.setToolTipText("");
        mathslider.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        mathslider.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("MATH RELATED ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("BUSINESS RELATED ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("PRACTICALS  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(jLabel10))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(233, 233, 233)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(matrictext)
                                    .addComponent(targetcgpatext)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(11, 11, 11)
                                        .addComponent(jLabel1))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(businessslider, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(proceedbutton)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mathslider, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(practicalslider, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(matrictext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel10)
                        .addGap(3, 3, 3)
                        .addComponent(targetcgpatext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mathslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(businessslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(practicalslider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(proceedbutton)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 4, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        conn = querydb.connectdb(); //calling the querydb class with the connection statement to the database

    }//GEN-LAST:event_formWindowOpened

    private void proceedbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proceedbuttonActionPerformed

        String targetcgpa = targetcgpatext.getText();//read in the targetcgpa
        TargetCGPA = Double.parseDouble(targetcgpa);// parse as a double
        matricnumber = matrictext.getText();//read in the matric number

        if (matricnumber.isEmpty()) { //prompt if matricnumber is empty
            return;
        }
        String matric = matricnumber;
        
        //returns the sum of grade weight of the students table from the database
        String query = "SELECT grade_weight FROM " + matric;
        try {
            pt = conn.prepareStatement(query);
            rs = pt.executeQuery();
            while (rs.next()) { // moves to the next roll
                totaltranscipt = totaltranscipt + rs.getDouble("grade_weight");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
//returns the difference between the students table and the curriculum_table using a switch statement
        switch (matricnumber) {
            case "12ch014325":
            String sql01 = "SELECT * FROM curriculum_table WHERE course_code NOT IN (SELECT course_code FROM 12ch014325 where grade!='F')";
            try {
                pt = conn.prepareStatement(sql01);
                rs = pt.executeQuery();

                int jj = 0;
                rs.last();//get to the last
                size = rs.getRow();// gets the number of rows and stores it to "size"
                rs.beforeFirst();
                RemUnit = new String[size][3];
                RemUnitss = new int[size];
                
                while (rs.next()) { // moves to the next roll
                    double y = rs.getInt("units");//stores the values in "units" to y
                    RemUnit[jj][0] = rs.getString("course_code");// reads the course_code from the db to the array
                    RemUnit[jj][1] = rs.getString("units");//reads the units
                    RemUnit[jj][2] = rs.getString("characteristics"); // reads the characteristics 
                    RemUnitss[jj] = rs.getInt("units");//reads it as an interger
                    sumofremainingunits = sumofremainingunits + y;
                    jj++;
                 }
            } catch (Exception e) {
                System.out.println(e);
            }
            break;
            case "13ch014356":
            String sql02 = "SELECT * FROM curriculum_table WHERE course_code NOT IN (SELECT course_code FROM 13ch014356 where grade='F')";
            try {
                pt = conn.prepareStatement(sql02);
                rs = pt.executeQuery();

                int jj = 0;
                rs.last();//get to the last
                size = rs.getRow();// gets the number of rows and stores it to "size"
                rs.beforeFirst();
                RemUnit = new String[size][3];
                RemUnitss = new int[size];
                
                while (rs.next()) { // moves to the next roll
                    double y = rs.getInt("units");//stores the values in "units" to y
                    RemUnit[jj][0] = rs.getString("course_code");// reads the course_code from the db to the array
                    RemUnit[jj][1] = rs.getString("units");//reads the units
                    RemUnit[jj][2] = rs.getString("characteristics"); // reads the characteristics 
                    RemUnitss[jj] = rs.getInt("units");//reads it as an interger
                    sumofremainingunits = sumofremainingunits + y;
                    jj++;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            break;
            case "16ch014371":
            String sql03 = "SELECT * FROM curriculum_table WHERE course_code NOT IN (SELECT course_code FROM 16ch014371 where grade='F')";
            try {
                pt = conn.prepareStatement(sql03);
                rs = pt.executeQuery();

                int jj = 0;
                rs.last();//get to the last
                size = rs.getRow();// gets the number of rows and stores it to "size"
                rs.beforeFirst();
                RemUnit = new String[size][3];
                RemUnitss = new int[size];
                
                while (rs.next()) { // moves to the next roll
                    double y = rs.getInt("units");//stores the values in "units" to y
                    RemUnit[jj][0] = rs.getString("course_code");// reads the course_code from the db to the array
                    RemUnit[jj][1] = rs.getString("units");//reads the units
                    RemUnit[jj][2] = rs.getString("characteristics"); // reads the characteristics 
                    RemUnitss[jj] = rs.getInt("units");//reads it as an interger
                    sumofremainingunits = sumofremainingunits + y;
                    jj++;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            break;
        }
        
        //finds the sum of units from the student table from the database
        String query3 = "SELECT units FROM " + matric;
        try {
            pt = conn.prepareStatement(query3);
            rs = pt.executeQuery();
            while (rs.next()) { // moves to the next roll
                totaltranscriptunits = totaltranscriptunits + rs.getDouble("units");
                System.out.println(totaltranscriptunits);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        //checking if the student can still achieve their target CGPA
        double sumCGPA;
        double resultCGPA;

        sumCGPA = (totaltranscipt + (sumofremainingunits * 5));
        resultCGPA = (sumCGPA / (totaltranscriptunits + sumofremainingunits));
        if (resultCGPA < TargetCGPA) {
            System.out.println("NOT POSSIBLE");
        } else if (resultCGPA > TargetCGPA) {
            System.out.println("NOW OPTIMIZING");
        }
        
        // recieve from slider
        characterrating = new int[3];
        characterrating[0] = mathslider.getValue();
        characterrating[1] = businessslider.getValue();
        characterrating[2] = practicalslider.getValue();
        
        
        //OPTIMIZING
        NondominatedPopulation result = new Executor()
        .withProblemClass(Optimization.iGPA.class)
        .withAlgorithm("SMPSO")
        .withMaxEvaluations(100000) // number of runs
        .run();

        //String daaa[size][2];
        outputforOptimization = new String[size][2];
        for (Solution solution : result) {
            //float a = (float) solution.getObjective(0);
            for (int i = 0; i < size; i++) {
                outputforOptimization[i][0] = RemUnit[i][0];
                outputforOptimization[i][1] = Integer.toString(EncodingUtils.getInt(solution.getVariable(i)));
            }
            //System.out.println("The Possible CGPA is:" + a);
        }
        outputarray = new String[size][4];
        for (int i = 0; i < size; i++) {
            String query4 = "SELECT * FROM curriculum_table WHERE course_code='" + outputforOptimization[i][0] + "'";
            try {
                // reads the units and outputs as a grade
                if (outputforOptimization[i][1].equals("5")) {
                    outputarray[i][3] = "A";
                } else if (outputforOptimization[i][1].equals("4")) {
                    outputarray[i][3] = "B";
                } else if (outputforOptimization[i][1].equals("3")) {
                    outputarray[i][3] = "C";
                } else if (outputforOptimization[i][1].equals("2")) {
                    outputarray[i][3] = "D";
                }
                ppt = conn.prepareStatement(query4);
                peace = ppt.executeQuery();
                while (peace.next()) {
                    outputarray[i][0] = peace.getString("course_code");
                    outputarray[i][1] = peace.getString("course_title");
                    outputarray[i][2] = peace.getString("units");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        String [][]dd=outputarray;
        
        System.out.println(Arrays.deepToString(outputarray));
       // table.showtable();
       
                CustomModel model = new CustomModel();
                
                table.setModel(model);
                frame.add(new JScrollPane(table));
                frame.pack();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);

        //Validating the absence of two periods '.'
        try {
            double doubletargetcgpa = Double.parseDouble(targetcgpa);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Please Input Valid Current and Desired Graduating CGPA");
            return;
        }
        double doubletargetcgpa = Double.parseDouble(targetcgpa);

        if (doubletargetcgpa < 0) {
            JOptionPane.showMessageDialog(this, "Your Current CGPA Cannot be Lesser Than 0");
            return;
        }

        if (doubletargetcgpa > 5) {
            JOptionPane.showMessageDialog(this, "Your Desired Graduating CGPA Cannot be Greater Than 5.0");
        }
    }//GEN-LAST:event_proceedbuttonActionPerformed

    private void matrictextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_matrictextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_matrictextActionPerformed

    public static void main(String args[]) {

      //System.out.println("Its Here"+LoginPage.outputarray);
        
        
        Runnable r = new Runnable() {

            @Override
            public void run() {
                new LoginPage().setVisible(true);
                //String [][]dd=LoginPage.outputarray;
                

                
                
                             
            }
        };

        EventQueue.invokeLater(r);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JSlider businessslider;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JSlider mathslider;
    private javax.swing.JTextField matrictext;
    public javax.swing.JSlider practicalslider;
    private javax.swing.JButton proceedbutton;
    private javax.swing.JTextField targetcgpatext;
    // End of variables declaration//GEN-END:variables



}

class Result {
    private String course_code;
    private String course_title;
    private String units;
    private String grades;

    public Result(String course_code, String title, String units, String grade) {
        this.course_code = course_code;
        this.units = units;
        this.course_title=title;
        this.grades=grade;
    }
    
    public String getTitle() {
        return course_title;
    }
    public void setName(String title) {
        this.course_title = title;
    }
    public String getUnit() {
        return units;
    }
    public void setUnits(String units) {
        this.units = units;
    }
    
    public String getGrade() {
        return grades;
    }
    public void setGrade(String grade) {
        this.grades = grade;
    }
    
    public String getCode() {
        return course_code;
    }
    public void setCode(String code) {
        this.course_code = code;
    }
      
    }

class CustomModel extends AbstractTableModel {
    
    public List<Result> data;
    String[] columnNames = {"Course code", "Course Title","Units","Grade"};
    
    
    public CustomModel() {
        data = new ArrayList<Result>();
        
        String dd[][]=outputarray;
        System.out.println("This"+outputarray);
        String [][] ff={{"A","1","B","C"},{"T","3","S","F"}};
        
        for (String[] dd1 : dd) {
            data.add(new Result(dd1[0], dd1[1], dd1[2], dd1[3]));
        }
        //data.add(new Result(dd[1][0],dd[1][1],dd[1][2], dd[1][3]));
        

    }

    @Override
    public String getColumnName(int column) {
        return columnNames[column];
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    public int getRowCount() {
        return data.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Result result = data.get(rowIndex);
        switch (columnIndex) {
        case 0:
            return result.getCode();
        case 1:
            return result.getTitle();
        case 2:
            return result.getUnit();
        case 3:
            return result.getGrade();
        default:
            return null;
        }
    }
}
