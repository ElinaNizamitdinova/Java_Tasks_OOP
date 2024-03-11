package javaTasks.OOP_Test.View;

import javaTasks.OOP_Test.Model.Type;

public class OperationView {
    public void showResult(double numberA, double numberB, double result, Type type){
        if(Type.ADDITION==type){
            System.out.printf("\n"+numberA+"+"+numberB+"="+result+"\n" );
        }
        if(Type.MULTIPLICATION==type){
            System.out.printf("\n"+numberA+"*"+numberB+"="+result+"\n" );
        }
        if(Type.DIVISION==type){
            System.out.printf("\n"+numberA+"/"+numberB+"="+result+"\n" );
        }
    }
}
