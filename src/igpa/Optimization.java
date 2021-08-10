/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package igpa;


import org.moeaframework.core.Solution;
import org.moeaframework.core.variable.EncodingUtils;
import org.moeaframework.problem.AbstractProblem;

public class Optimization {

    public static class iGPA extends AbstractProblem {

        public iGPA() {
            super(LoginPage.size, 1, 100); //(y=number of variables, x-numbr of objectives, and the number of possible outcomes)
        }

        @Override
        public Solution newSolution() {
            Solution solution = new Solution(getNumberOfVariables(),
                    getNumberOfObjectives(), getNumberOfConstraints());

            for (int i = 0; i < getNumberOfVariables(); i++) {
                solution.setVariable(i, EncodingUtils.newInt(2, 5));
            }

            return solution;
        }

        public static int sd[] = LoginPage.RemUnitss;
        public static String [][]collector=LoginPage.RemUnit;
        
        
        public static int characteristics[] = LoginPage.characterrating;
        //Load then here
        
           
       

        public void evaluate(Solution solution) {
            int[] course = EncodingUtils.getInt(solution);
            double targetweight = 0;
            double possiblecgpa = 0;

            for (int i = 0; i < LoginPage.RemUnit.length; i++) {
                targetweight += Integer.parseInt(LoginPage.RemUnit[i][1]) * course[i];
            }

                possiblecgpa = (LoginPage.totaltranscipt + targetweight) / (LoginPage.totaltranscriptunits + LoginPage.sumofremainingunits);

                //setting the objectives and constraints
                solution.setObjective(0, -possiblecgpa);
                solution.setConstraint(0, possiblecgpa <= LoginPage.TargetCGPA ? 0 : possiblecgpa);
                
               
                for(int i=0;i<LoginPage.RemUnit.length;i++){
                    if(LoginPage.RemUnit[i][2].equals("MATH RELATED")){
                        if(LoginPage.characterrating[0]==1){
                            solution.setConstraint((i+1), course[i] <= 3 ? 0 : course[i]);
                        }
                        
                        else if(LoginPage.characterrating[0]==2){
                            solution.setConstraint((i+1), course[i] > 3 ? 0 : course[i]);
                        }
                        
                    }
                    else if(LoginPage.RemUnit[i][2].equals("BUSINESS RELATED")){
                        if(LoginPage.characterrating[1]==1){
                            solution.setConstraint((i+1), course[i] <= 3 ? 0 : course[i]);
                        }
                        
                        else if(LoginPage.characterrating[1]==2){
                            solution.setConstraint((i+1), course[i] > 3 ? 0 : course[i]);
                        }
                        
                    }
                    else if(LoginPage.RemUnit[i][2].equals("COMPUTER SCIENCE RELATED")){
                        if(LoginPage.characterrating[2]==1){
                            solution.setConstraint((i+1), course[i] <= 3 ? 0 : course[i]);
                        }
                        
                        else if(LoginPage.characterrating[2]==2){
                            solution.setConstraint((i+1), course[i] > 3 ? 0 : course[i]);
                        }
                    }
                }
        }
                
                

        }
}


    

