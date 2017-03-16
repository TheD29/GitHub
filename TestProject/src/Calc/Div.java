package Calc;

public class Div extends CModel {

    public Div() {
        super();
        // TODO Auto-generated constructor stub
    }

    public Div(double fnum, double lnum) {
        super(fnum, lnum);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected double operation() {
        // TODO Auto-generated method stub
        return sum = getFnum() / getLnum();
    }
}
