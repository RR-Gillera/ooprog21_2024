public class BloodData{
   private String bloodType;
   private String rhFactor;
   
   BloodData(){
      this.bloodType = "O";
      this.rhFactor = "+";
   }
   
   BloodData(String blType, String rFactor){
      bloodType = blType;
      rFactor = rFactor;   
   }
   
   public void setBloodType(String blType){
      bloodType = blType;
   }
   
   String getBloodType(){
      return bloodType;
   }
   
   public void setRhFactor(tring rFactor){\
      rFactor = rFactor;
   }
   
   String getRhFactor(){
      return rhFactor;
}
