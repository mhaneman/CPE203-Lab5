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

   // additional likely methods not defined since they are not needed for testing
   public boolean equals(Object o)
   {
      if (o != null && o instanceof CourseSection)
         if (this.prefix.equals(((CourseSection) o).prefix) &&
                 this.number.equals(((CourseSection) o).number) &&
                 this.enrollment == ((CourseSection) o).enrollment &&
                 this.startTime.equals(((CourseSection) o).startTime) &&
                 this.endTime.equals(((CourseSection) o).endTime))
            return true;
      return false;
   }

   public int hashCode()
   {
      return hashSTR(prefix) + hashSTR(number) + enrollment + hashLocalTime(startTime) + hashLocalTime(endTime);
   }

   private int hashSTR(String str)
   {
      int result = 0;
      for(char i : str.toCharArray())
      {
         result += (int)i * (result + 1);
      }
      return result;

   }
   private int hashLocalTime(LocalTime time)
   {
      return (time.getHour()*3600 + time.getMinute()*60 + time.getSecond())*time.getNano();
   }
}

