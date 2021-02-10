class MultiplyExpression extends BinaryExpression
{
   public static final String operator = "mult";
   public MultiplyExpression(final Expression lft, final Expression rht)
   {
      super(lft, rht, operator);
   }

   protected double applyOperator(double lft, double rht)
   {
      return lft * rht;
   }
}

