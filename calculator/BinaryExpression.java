package calculator;

public abstract class BinaryExpression implements Expression
{
    private Expression lft;
    private Expression rht;
    private String opp;

    public BinaryExpression(Expression lft, Expression rht, String opp) {
        this.lft = lft;
        this.rht = rht;
        this.opp = opp;
    }

    protected abstract double applyOperator(double lft, double rht);

    public String toString()
    {
        return "(" + lft + " " + opp + " " + rht + ")";
    }

    public double evaluate(final Bindings bindings)
    {
        return applyOperator(lft.evaluate(bindings), rht.evaluate(bindings));
    }
}
