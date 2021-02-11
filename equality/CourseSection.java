import java.time.LocalTime;
class CourseSection
{
   private final String prefix;
   private final String number;
   private final int enrollment;
   private final LocalTime startTime;
   private final LocalTime endTime;

   public CourseSection(final String prefix, final String number,
                        final int enrollment, final LocalTime startTime, final LocalTime endTime)
   {
      this.prefix = prefix;
      this.number = number;
      this.enrollment = enrollment;
      this.startTime = startTime;
      this.endTime = endTime;
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      CourseSection that = (CourseSection) o;

      if (enrollment != that.enrollment) return false;
      if (!prefix.equals(that.prefix)) return false;
      if (!number.equals(that.number)) return false;
      if (!startTime.equals(that.startTime)) return false;
      return endTime.equals(that.endTime);
   }

   @Override
   public int hashCode() {
      int result = 7;
      if(prefix != null)
         result = 31 * result + prefix.hashCode();
      if(number != null)
         result = 31 * result + number.hashCode();
      result = 31 * result + enrollment;
      if(startTime != null)
         result = 31 * result + startTime.hashCode();
      if(endTime != null)
         result = 31 * result + endTime.hashCode();
      return result;
   }
}

