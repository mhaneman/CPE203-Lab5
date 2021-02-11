class AddExpression extends BinaryExpression {
   public AddExpression(final Expression lft, final Expression rht)
   {
      super(lft, rht, "+");
   }

   protected double applyOperator(double lft, double rht)
   {
      return lft + rht;
   }

}
