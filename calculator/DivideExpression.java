class DivideExpression extends BinaryExpression
{
   public static final String operator = "/";
   public DivideExpression(final Expression lft, final Expression rht)
   {
      super(lft, rht, operator);
   }

   protected double applyOperator(double lft, double rht)
   {
      return lft / rht;
   }
}

