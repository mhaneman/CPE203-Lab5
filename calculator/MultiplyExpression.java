class MultiplyExpression extends BinaryExpression
{
   public MultiplyExpression(final Expression lft, final Expression rht)
   {
      super(lft, rht, "*");
   }

   protected double applyOperator(double lft, double rht)
   {
      return lft * rht;
   }
}

