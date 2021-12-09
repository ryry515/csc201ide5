abstract public class School
{
   private int enrollment;
   public abstract void describeLevel(); 
   private String name;

   public void setName(String newName){
      name = newName;
   }
   public void setEnrollment(int students)
   {
      enrollment = students;
   }
   public int getEnrollment()
   {
      return enrollment;
   }
   public void displaySchool(){
      System.out.println("School's Name is " + name);
   }
}